package Windows.Devices.Perception

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IKnownPerceptionFrameSourcePropertiesStatics.ABI::class)
@Signature("{5df1cca2-01f8-4a87-b859-d5e5b7e1de47}")
@Guid("5df1cca201f84a87b859d5e5b7e1de47")
@WinRTInterface("5df1cca201f84a87b859d5e5b7e1de47")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownPerceptionFrameSourcePropertiesStatics.ByReference::class)
public interface IKnownPerceptionFrameSourcePropertiesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_PhysicalDeviceIds(): String?

  @InterfaceMethod(2)
  public fun get_FrameKind(): String?

  @InterfaceMethod(3)
  public fun get_DeviceModelVersion(): String?

  @InterfaceMethod(4)
  public fun get_EnclosureLocation(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownPerceptionFrameSourcePropertiesStatics> {
    public override fun getValue() =
        ABI.makeIKnownPerceptionFrameSourcePropertiesStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownPerceptionFrameSourcePropertiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownPerceptionFrameSourcePropertiesStatics {
    public val __1743424790_Ptr: Pointer?

    public val _1743424790_VtblPtr: Pointer?
      get() = __1743424790_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1743424790_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1743424790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PhysicalDeviceIds(): String? {
      val fnPtr = _1743424790_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1743424790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FrameKind(): String? {
      val fnPtr = _1743424790_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1743424790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DeviceModelVersion(): String? {
      val fnPtr = _1743424790_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1743424790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_EnclosureLocation(): String? {
      val fnPtr = _1743424790_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1743424790_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKnownPerceptionFrameSourcePropertiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1743424790_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownPerceptionFrameSourcePropertiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5df1cca201f84a87b859d5e5b7e1de47")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownPerceptionFrameSourcePropertiesStatics(ptr: Pointer?): WithDefault =
        IKnownPerceptionFrameSourcePropertiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IKnownPerceptionFrameSourcePropertiesStatics {
      val address = segment.toRawLongValue()
      return makeIKnownPerceptionFrameSourcePropertiesStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownPerceptionFrameSourcePropertiesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1743424790_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownPerceptionFrameSourcePropertiesStatics):
        Array<IKnownPerceptionFrameSourcePropertiesStatics?> = (elements as
        Array<IKnownPerceptionFrameSourcePropertiesStatics?>).castToImpl<IKnownPerceptionFrameSourcePropertiesStatics,IKnownPerceptionFrameSourcePropertiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownPerceptionFrameSourcePropertiesStatics?> =
        arrayOfNulls<IKnownPerceptionFrameSourcePropertiesStatics_Impl>(size) as
        Array<IKnownPerceptionFrameSourcePropertiesStatics?>
  }
}
