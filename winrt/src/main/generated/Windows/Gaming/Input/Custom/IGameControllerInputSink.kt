package Windows.Gaming.Input.Custom

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

@ABIMarker(IGameControllerInputSink.ABI::class)
@Signature("{1ff6f922-c640-4c78-a820-9a715c558bcb}")
@Guid("1ff6f922c6404c78a8209a715c558bcb")
@WinRTInterface("1ff6f922c6404c78a8209a715c558bcb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameControllerInputSink.ByReference::class)
public interface IGameControllerInputSink : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnInputResumed(timestamp: WinDef.ULONG): Unit

  @InterfaceMethod(1)
  public fun OnInputSuspended(timestamp: WinDef.ULONG): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameControllerInputSink> {
    public override fun getValue() = ABI.makeIGameControllerInputSink(pointer.getPointer(0))

    public fun setValue(value: IGameControllerInputSink_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameControllerInputSink {
    public val __895392785_Ptr: Pointer?

    public val _895392785_VtblPtr: Pointer?
      get() = __895392785_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnInputResumed(timestamp: WinDef.ULONG): Unit {
      val fnPtr = _895392785_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__895392785_Ptr, timestamp,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun OnInputSuspended(timestamp: WinDef.ULONG): Unit {
      val fnPtr = _895392785_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__895392785_Ptr, timestamp,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGameControllerInputSink_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __895392785_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameControllerInputSink, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ff6f922c6404c78a8209a715c558bcb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameControllerInputSink(ptr: Pointer?): WithDefault =
        IGameControllerInputSink_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameControllerInputSink {
      val address = segment.toRawLongValue()
      return makeIGameControllerInputSink(Pointer(address))
    }

    public override fun toNative(obj: IGameControllerInputSink): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__895392785_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameControllerInputSink):
        Array<IGameControllerInputSink?> = (elements as
        Array<IGameControllerInputSink?>).castToImpl<IGameControllerInputSink,IGameControllerInputSink_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameControllerInputSink?> =
        arrayOfNulls<IGameControllerInputSink_Impl>(size) as Array<IGameControllerInputSink?>
  }
}
