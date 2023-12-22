package Windows.Devices.SmartCards

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

@ABIMarker(ISmartCardEmulatorConnectionProperties.ABI::class)
@Signature("{4e2ca5ee-f969-507d-6cf9-34e2d18df311}")
@Guid("4e2ca5eef969507d6cf934e2d18df311")
@WinRTInterface("4e2ca5eef969507d6cf934e2d18df311")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardEmulatorConnectionProperties.ByReference::class)
public interface ISmartCardEmulatorConnectionProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_Source(): SmartCardEmulatorConnectionSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardEmulatorConnectionProperties> {
    public override fun getValue() =
        ABI.makeISmartCardEmulatorConnectionProperties(pointer.getPointer(0))

    public fun setValue(value: ISmartCardEmulatorConnectionProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardEmulatorConnectionProperties {
    public val __1821644204_Ptr: Pointer?

    public val _1821644204_VtblPtr: Pointer?
      get() = __1821644204_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _1821644204_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__1821644204_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Source(): SmartCardEmulatorConnectionSource? {
      val fnPtr = _1821644204_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardEmulatorConnectionSource>()
      val hr = fn.invokeHR(arrayOf(__1821644204_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardEmulatorConnectionSource>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardEmulatorConnectionProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1821644204_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardEmulatorConnectionProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e2ca5eef969507d6cf934e2d18df311")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardEmulatorConnectionProperties(ptr: Pointer?): WithDefault =
        ISmartCardEmulatorConnectionProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardEmulatorConnectionProperties {
      val address = segment.toRawLongValue()
      return makeISmartCardEmulatorConnectionProperties(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardEmulatorConnectionProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1821644204_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardEmulatorConnectionProperties):
        Array<ISmartCardEmulatorConnectionProperties?> = (elements as
        Array<ISmartCardEmulatorConnectionProperties?>).castToImpl<ISmartCardEmulatorConnectionProperties,ISmartCardEmulatorConnectionProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardEmulatorConnectionProperties?> =
        arrayOfNulls<ISmartCardEmulatorConnectionProperties_Impl>(size) as
        Array<ISmartCardEmulatorConnectionProperties?>
  }
}
