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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMaintenanceTriggerFactory.ABI::class)
@Signature("{4b3ddb2e-97dd-4629-88b0-b06cf9482ae5}")
@Guid("4b3ddb2e97dd462988b0b06cf9482ae5")
@WinRTInterface("4b3ddb2e97dd462988b0b06cf9482ae5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMaintenanceTriggerFactory.ByReference::class)
public interface IMaintenanceTriggerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(freshnessTime: WinDef.UINT, oneShot: Boolean): MaintenanceTrigger?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMaintenanceTriggerFactory> {
    public override fun getValue() = ABI.makeIMaintenanceTriggerFactory(pointer.getPointer(0))

    public fun setValue(value: IMaintenanceTriggerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMaintenanceTriggerFactory {
    public val __246649172_Ptr: Pointer?

    public val _246649172_VtblPtr: Pointer?
      get() = __246649172_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(freshnessTime: WinDef.UINT, oneShot: Boolean): MaintenanceTrigger? {
      val fnPtr = _246649172_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MaintenanceTrigger>()
      val hr = fn.invokeHR(arrayOf(__246649172_Ptr, freshnessTime, oneShot, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MaintenanceTrigger>(result.getValue())
      return resultValue
    }
  }

  public class IMaintenanceTriggerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __246649172_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMaintenanceTriggerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4b3ddb2e97dd462988b0b06cf9482ae5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMaintenanceTriggerFactory(ptr: Pointer?): WithDefault =
        IMaintenanceTriggerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMaintenanceTriggerFactory {
      val address = segment.toRawLongValue()
      return makeIMaintenanceTriggerFactory(Pointer(address))
    }

    public override fun toNative(obj: IMaintenanceTriggerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__246649172_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMaintenanceTriggerFactory):
        Array<IMaintenanceTriggerFactory?> = (elements as
        Array<IMaintenanceTriggerFactory?>).castToImpl<IMaintenanceTriggerFactory,IMaintenanceTriggerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMaintenanceTriggerFactory?> =
        arrayOfNulls<IMaintenanceTriggerFactory_Impl>(size) as Array<IMaintenanceTriggerFactory?>
  }
}
