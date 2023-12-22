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

@ABIMarker(ISystemTriggerFactory.ABI::class)
@Signature("{e80423d4-8791-4579-8126-87ec8aaa407a}")
@Guid("e80423d487914579812687ec8aaa407a")
@WinRTInterface("e80423d487914579812687ec8aaa407a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemTriggerFactory.ByReference::class)
public interface ISystemTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(triggerType: SystemTriggerType?, oneShot: Boolean): SystemTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemTriggerFactory> {
    public override fun getValue() = ABI.makeISystemTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: ISystemTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemTriggerFactory {
    public val __1730562126_Ptr: Pointer?

    public val _1730562126_VtblPtr: Pointer?
      get() = __1730562126_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(triggerType: SystemTriggerType?, oneShot: Boolean): SystemTrigger? {
      val fnPtr = _1730562126_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemTrigger>()
      val hr = fn.invokeHR(arrayOf(__1730562126_Ptr, marshalToNative(triggerType), oneShot, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemTrigger>(result.getValue())
      return resultValue
    }
  }

  public class ISystemTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1730562126_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e80423d487914579812687ec8aaa407a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemTriggerFactory(ptr: Pointer?): WithDefault =
        ISystemTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemTriggerFactory {
      val address = segment.toRawLongValue()
      return makeISystemTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: ISystemTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1730562126_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemTriggerFactory): Array<ISystemTriggerFactory?> =
        (elements as
        Array<ISystemTriggerFactory?>).castToImpl<ISystemTriggerFactory,ISystemTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemTriggerFactory?> =
        arrayOfNulls<ISystemTriggerFactory_Impl>(size) as Array<ISystemTriggerFactory?>
  }
}
