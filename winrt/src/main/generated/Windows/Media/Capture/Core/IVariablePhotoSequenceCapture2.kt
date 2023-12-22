package Windows.Media.Capture.Core

import Windows.Foundation.IAsyncAction
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(IVariablePhotoSequenceCapture2.ABI::class)
@Signature("{fe2c62bc-50b0-43e3-917c-e3b92798942f}")
@Guid("fe2c62bc50b043e3917ce3b92798942f")
@WinRTInterface("fe2c62bc50b043e3917ce3b92798942f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVariablePhotoSequenceCapture2.ByReference::class)
public interface IVariablePhotoSequenceCapture2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun UpdateSettingsAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVariablePhotoSequenceCapture2> {
    public override fun getValue() = ABI.makeIVariablePhotoSequenceCapture2(pointer.getPointer(0))

    public fun setValue(value: IVariablePhotoSequenceCapture2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVariablePhotoSequenceCapture2 {
    public val __1438445098_Ptr: Pointer?

    public val _1438445098_VtblPtr: Pointer?
      get() = __1438445098_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun UpdateSettingsAsync(): IAsyncAction? {
      val fnPtr = _1438445098_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1438445098_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IVariablePhotoSequenceCapture2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1438445098_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVariablePhotoSequenceCapture2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe2c62bc50b043e3917ce3b92798942f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVariablePhotoSequenceCapture2(ptr: Pointer?): WithDefault =
        IVariablePhotoSequenceCapture2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVariablePhotoSequenceCapture2 {
      val address = segment.toRawLongValue()
      return makeIVariablePhotoSequenceCapture2(Pointer(address))
    }

    public override fun toNative(obj: IVariablePhotoSequenceCapture2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1438445098_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVariablePhotoSequenceCapture2):
        Array<IVariablePhotoSequenceCapture2?> = (elements as
        Array<IVariablePhotoSequenceCapture2?>).castToImpl<IVariablePhotoSequenceCapture2,IVariablePhotoSequenceCapture2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVariablePhotoSequenceCapture2?> =
        arrayOfNulls<IVariablePhotoSequenceCapture2_Impl>(size) as
        Array<IVariablePhotoSequenceCapture2?>
  }
}
