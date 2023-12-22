package Windows.Devices.Custom

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

@ABIMarker(IKnownDeviceTypesStatics.ABI::class)
@Signature("{ee5479c2-5448-45da-ad1b-24948c239094}")
@Guid("ee5479c2544845daad1b24948c239094")
@WinRTInterface("ee5479c2544845daad1b24948c239094")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownDeviceTypesStatics.ByReference::class)
public interface IKnownDeviceTypesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Unknown(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownDeviceTypesStatics> {
    public override fun getValue() = ABI.makeIKnownDeviceTypesStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownDeviceTypesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownDeviceTypesStatics {
    public val __1805693335_Ptr: Pointer?

    public val _1805693335_VtblPtr: Pointer?
      get() = __1805693335_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Unknown(): WinDef.USHORT {
      val fnPtr = _1805693335_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1805693335_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IKnownDeviceTypesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1805693335_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownDeviceTypesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee5479c2544845daad1b24948c239094")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownDeviceTypesStatics(ptr: Pointer?): WithDefault =
        IKnownDeviceTypesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownDeviceTypesStatics {
      val address = segment.toRawLongValue()
      return makeIKnownDeviceTypesStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownDeviceTypesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1805693335_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownDeviceTypesStatics):
        Array<IKnownDeviceTypesStatics?> = (elements as
        Array<IKnownDeviceTypesStatics?>).castToImpl<IKnownDeviceTypesStatics,IKnownDeviceTypesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownDeviceTypesStatics?> =
        arrayOfNulls<IKnownDeviceTypesStatics_Impl>(size) as Array<IKnownDeviceTypesStatics?>
  }
}
