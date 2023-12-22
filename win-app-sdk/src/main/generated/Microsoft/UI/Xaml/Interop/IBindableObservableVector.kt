package Microsoft.UI.Xaml.Interop

import Microsoft.UI.Xaml.Interop.IBindableVector.ABI.IID
import Windows.Foundation.EventRegistrationToken
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBindableObservableVector.ABI::class)
@Signature("{fe1eb536-7e7f-4f90-ac9a-474984aae512}")
@Guid("fe1eb5367e7f4f90ac9a474984aae512")
@WinRTInterface("fe1eb5367e7f4f90ac9a474984aae512")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindableObservableVector.ByReference::class)
public interface IBindableObservableVector : NativeMapped, IWinRTInterface, IBindableVector,
    IBindableIterable {
  @InterfaceMethod(0)
  public fun add_VectorChanged(handler: BindableVectorChangedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_VectorChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBindableObservableVector> {
    public override fun getValue() = ABI.makeIBindableObservableVector(pointer.getPointer(0))

    public fun setValue(value: IBindableObservableVector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindableObservableVector, IBindableVector.WithDefault,
      IBindableIterable.WithDefault {
    public val __527613419_Ptr: Pointer?

    public val _527613419_VtblPtr: Pointer?
      get() = __527613419_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_VectorChanged(handler: BindableVectorChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _527613419_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__527613419_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_VectorChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _527613419_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__527613419_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBindableObservableVector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBindableVector,
      IBindableIterable {
    public override val __816324018_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_527613419_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2104271137_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IBindableIterable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_527613419_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __527613419_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindableObservableVector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe1eb5367e7f4f90ac9a474984aae512")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindableObservableVector(ptr: Pointer?): WithDefault =
        IBindableObservableVector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindableObservableVector {
      val address = segment.toRawLongValue()
      return makeIBindableObservableVector(Pointer(address))
    }

    public override fun toNative(obj: IBindableObservableVector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__527613419_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindableObservableVector):
        Array<IBindableObservableVector?> = (elements as
        Array<IBindableObservableVector?>).castToImpl<IBindableObservableVector,IBindableObservableVector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindableObservableVector?> =
        arrayOfNulls<IBindableObservableVector_Impl>(size) as Array<IBindableObservableVector?>
  }
}
