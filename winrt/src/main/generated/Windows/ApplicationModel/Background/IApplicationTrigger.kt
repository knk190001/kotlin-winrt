package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IApplicationTrigger.ABI::class)
@Signature("{0b468630-9574-492c-9e93-1a3ae6335fe9}")
@Guid("0b4686309574492c9e931a3ae6335fe9")
@WinRTInterface("0b4686309574492c9e931a3ae6335fe9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationTrigger.ByReference::class)
public interface IApplicationTrigger : NativeMapped, IWinRTInterface, IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun RequestAsync(): IAsyncOperation<ApplicationTriggerResult?>?

  @InterfaceMethod(1)
  public fun RequestAsync(arguments: ValueSet?): IAsyncOperation<ApplicationTriggerResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationTrigger> {
    public override fun getValue() = ABI.makeIApplicationTrigger(pointer.getPointer(0))

    public fun setValue(value: IApplicationTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationTrigger, IBackgroundTrigger.WithDefault {
    public val __734583289_Ptr: Pointer?

    public val _734583289_VtblPtr: Pointer?
      get() = __734583289_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAsync(): IAsyncOperation<ApplicationTriggerResult?>? {
      val fnPtr = _734583289_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ApplicationTriggerResult?>>()
      val hr = fn.invokeHR(arrayOf(__734583289_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ApplicationTriggerResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAsync(arguments: ValueSet?):
        IAsyncOperation<ApplicationTriggerResult?>? {
      val fnPtr = _734583289_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ApplicationTriggerResult?>>()
      val hr = fn.invokeHR(arrayOf(__734583289_Ptr, marshalToNative(arguments), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<ApplicationTriggerResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_734583289_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __734583289_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0b4686309574492c9e931a3ae6335fe9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationTrigger(ptr: Pointer?): WithDefault = IApplicationTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationTrigger {
      val address = segment.toRawLongValue()
      return makeIApplicationTrigger(Pointer(address))
    }

    public override fun toNative(obj: IApplicationTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__734583289_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationTrigger): Array<IApplicationTrigger?> =
        (elements as
        Array<IApplicationTrigger?>).castToImpl<IApplicationTrigger,IApplicationTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationTrigger?> =
        arrayOfNulls<IApplicationTrigger_Impl>(size) as Array<IApplicationTrigger?>
  }
}
