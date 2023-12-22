package Windows.Media.Capture.Core

import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Media.Capture.CapturedFrame
import Windows.Media.Capture.CapturedFrameControlValues
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IVariablePhotoCapturedEventArgs.ABI::class)
@Signature("{d1eb4c5c-1b53-4e4a-8b5c-db7887ac949b}")
@Guid("d1eb4c5c1b534e4a8b5cdb7887ac949b")
@WinRTInterface("d1eb4c5c1b534e4a8b5cdb7887ac949b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVariablePhotoCapturedEventArgs.ByReference::class)
public interface IVariablePhotoCapturedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Frame(): CapturedFrame?

  @InterfaceMethod(1)
  public fun get_CaptureTimeOffset(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_UsedFrameControllerIndex(): IReference<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun get_CapturedFrameControlValues(): CapturedFrameControlValues?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVariablePhotoCapturedEventArgs> {
    public override fun getValue() = ABI.makeIVariablePhotoCapturedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IVariablePhotoCapturedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVariablePhotoCapturedEventArgs {
    public val __1806915120_Ptr: Pointer?

    public val _1806915120_VtblPtr: Pointer?
      get() = __1806915120_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Frame(): CapturedFrame? {
      val fnPtr = _1806915120_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CapturedFrame>()
      val hr = fn.invokeHR(arrayOf(__1806915120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CapturedFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CaptureTimeOffset(): TimeSpan? {
      val fnPtr = _1806915120_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1806915120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_UsedFrameControllerIndex(): IReference<WinDef.UINT>? {
      val fnPtr = _1806915120_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1806915120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CapturedFrameControlValues(): CapturedFrameControlValues? {
      val fnPtr = _1806915120_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CapturedFrameControlValues>()
      val hr = fn.invokeHR(arrayOf(__1806915120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CapturedFrameControlValues>(result.getValue())
      return resultValue
    }
  }

  public class IVariablePhotoCapturedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1806915120_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVariablePhotoCapturedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1eb4c5c1b534e4a8b5cdb7887ac949b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVariablePhotoCapturedEventArgs(ptr: Pointer?): WithDefault =
        IVariablePhotoCapturedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVariablePhotoCapturedEventArgs {
      val address = segment.toRawLongValue()
      return makeIVariablePhotoCapturedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IVariablePhotoCapturedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1806915120_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVariablePhotoCapturedEventArgs):
        Array<IVariablePhotoCapturedEventArgs?> = (elements as
        Array<IVariablePhotoCapturedEventArgs?>).castToImpl<IVariablePhotoCapturedEventArgs,IVariablePhotoCapturedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVariablePhotoCapturedEventArgs?> =
        arrayOfNulls<IVariablePhotoCapturedEventArgs_Impl>(size) as
        Array<IVariablePhotoCapturedEventArgs?>
  }
}
