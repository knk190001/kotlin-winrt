package Windows.Perception.People

import Windows.Foundation.IAsyncOperation
import Windows.UI.Input.GazeInputAccessStatus
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEyesPoseStatics.ABI::class)
@Signature("{1cff7413-b21f-54c0-80c1-e60d994ca58c}")
@Guid("1cff7413b21f54c080c1e60d994ca58c")
@WinRTInterface("1cff7413b21f54c080c1e60d994ca58c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEyesPoseStatics.ByReference::class)
public interface IEyesPoseStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  @InterfaceMethod(1)
  public fun RequestAccessAsync(): IAsyncOperation<GazeInputAccessStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEyesPoseStatics> {
    public override fun getValue() = ABI.makeIEyesPoseStatics(pointer.getPointer(0))

    public fun setValue(value: IEyesPoseStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEyesPoseStatics {
    public val __1671168042_Ptr: Pointer?

    public val _1671168042_VtblPtr: Pointer?
      get() = __1671168042_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _1671168042_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1671168042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun RequestAccessAsync(): IAsyncOperation<GazeInputAccessStatus?>? {
      val fnPtr = _1671168042_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GazeInputAccessStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1671168042_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<GazeInputAccessStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IEyesPoseStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1671168042_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEyesPoseStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1cff7413b21f54c080c1e60d994ca58c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEyesPoseStatics(ptr: Pointer?): WithDefault = IEyesPoseStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEyesPoseStatics {
      val address = segment.toRawLongValue()
      return makeIEyesPoseStatics(Pointer(address))
    }

    public override fun toNative(obj: IEyesPoseStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1671168042_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEyesPoseStatics): Array<IEyesPoseStatics?> = (elements as
        Array<IEyesPoseStatics?>).castToImpl<IEyesPoseStatics,IEyesPoseStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEyesPoseStatics?> =
        arrayOfNulls<IEyesPoseStatics_Impl>(size) as Array<IEyesPoseStatics?>
  }
}
