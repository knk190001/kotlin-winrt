package Windows.Networking.Sockets

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

@ABIMarker(IStreamSocketListenerControl.ABI::class)
@Signature("{20d8c576-8d8a-4dba-9722-a16c4d984980}")
@Guid("20d8c5768d8a4dba9722a16c4d984980")
@WinRTInterface("20d8c5768d8a4dba9722a16c4d984980")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocketListenerControl.ByReference::class)
public interface IStreamSocketListenerControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QualityOfService(): SocketQualityOfService?

  @InterfaceMethod(1)
  public fun put_QualityOfService(value: SocketQualityOfService?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamSocketListenerControl> {
    public override fun getValue() = ABI.makeIStreamSocketListenerControl(pointer.getPointer(0))

    public fun setValue(value: IStreamSocketListenerControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocketListenerControl {
    public val __784315202_Ptr: Pointer?

    public val _784315202_VtblPtr: Pointer?
      get() = __784315202_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QualityOfService(): SocketQualityOfService? {
      val fnPtr = _784315202_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SocketQualityOfService>()
      val hr = fn.invokeHR(arrayOf(__784315202_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SocketQualityOfService>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_QualityOfService(value: SocketQualityOfService?): Unit {
      val fnPtr = _784315202_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__784315202_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStreamSocketListenerControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __784315202_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocketListenerControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("20d8c5768d8a4dba9722a16c4d984980")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocketListenerControl(ptr: Pointer?): WithDefault =
        IStreamSocketListenerControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocketListenerControl {
      val address = segment.toRawLongValue()
      return makeIStreamSocketListenerControl(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocketListenerControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__784315202_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocketListenerControl):
        Array<IStreamSocketListenerControl?> = (elements as
        Array<IStreamSocketListenerControl?>).castToImpl<IStreamSocketListenerControl,IStreamSocketListenerControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocketListenerControl?> =
        arrayOfNulls<IStreamSocketListenerControl_Impl>(size) as
        Array<IStreamSocketListenerControl?>
  }
}
