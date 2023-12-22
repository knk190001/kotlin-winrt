package Windows.ApplicationModel.Background

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

@ABIMarker(ISocketActivityTrigger.ABI::class)
@Signature("{a9bbf810-9dde-4f8a-83e3-b0e0e7a50d70}")
@Guid("a9bbf8109dde4f8a83e3b0e0e7a50d70")
@WinRTInterface("a9bbf8109dde4f8a83e3b0e0e7a50d70")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISocketActivityTrigger.ByReference::class)
public interface ISocketActivityTrigger : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsWakeFromLowPowerSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISocketActivityTrigger> {
    public override fun getValue() = ABI.makeISocketActivityTrigger(pointer.getPointer(0))

    public fun setValue(value: ISocketActivityTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISocketActivityTrigger {
    public val __322415205_Ptr: Pointer?

    public val _322415205_VtblPtr: Pointer?
      get() = __322415205_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsWakeFromLowPowerSupported(): Boolean {
      val fnPtr = _322415205_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__322415205_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISocketActivityTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __322415205_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISocketActivityTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9bbf8109dde4f8a83e3b0e0e7a50d70")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISocketActivityTrigger(ptr: Pointer?): WithDefault =
        ISocketActivityTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISocketActivityTrigger {
      val address = segment.toRawLongValue()
      return makeISocketActivityTrigger(Pointer(address))
    }

    public override fun toNative(obj: ISocketActivityTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__322415205_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISocketActivityTrigger): Array<ISocketActivityTrigger?> =
        (elements as
        Array<ISocketActivityTrigger?>).castToImpl<ISocketActivityTrigger,ISocketActivityTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISocketActivityTrigger?> =
        arrayOfNulls<ISocketActivityTrigger_Impl>(size) as Array<ISocketActivityTrigger?>
  }
}
