package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.Foundation.Collections.IVectorView
import Windows.Storage.IStorageItem
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFileActivatedEventArgs.ABI::class)
@Signature("{bb2afc33-93b1-42ed-8b26-236dd9c78496}")
@Guid("bb2afc3393b142ed8b26236dd9c78496")
@WinRTInterface("bb2afc3393b142ed8b26236dd9c78496")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileActivatedEventArgs.ByReference::class)
public interface IFileActivatedEventArgs : NativeMapped, IWinRTInterface, IActivatedEventArgs {
  @InterfaceMethod(0)
  public fun get_Files(): IVectorView<IStorageItem?>?

  @InterfaceMethod(1)
  public fun get_Verb(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileActivatedEventArgs> {
    public override fun getValue() = ABI.makeIFileActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IFileActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileActivatedEventArgs, IActivatedEventArgs.WithDefault {
    public val __136556715_Ptr: Pointer?

    public val _136556715_VtblPtr: Pointer?
      get() = __136556715_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Files(): IVectorView<IStorageItem?>? {
      val fnPtr = _136556715_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IStorageItem?>>()
      val hr = fn.invokeHR(arrayOf(__136556715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IStorageItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Verb(): String? {
      val fnPtr = _136556715_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__136556715_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IFileActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_136556715_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __136556715_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb2afc3393b142ed8b26236dd9c78496")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileActivatedEventArgs(ptr: Pointer?): WithDefault =
        IFileActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIFileActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IFileActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__136556715_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileActivatedEventArgs): Array<IFileActivatedEventArgs?>
        = (elements as
        Array<IFileActivatedEventArgs?>).castToImpl<IFileActivatedEventArgs,IFileActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileActivatedEventArgs?> =
        arrayOfNulls<IFileActivatedEventArgs_Impl>(size) as Array<IFileActivatedEventArgs?>
  }
}
