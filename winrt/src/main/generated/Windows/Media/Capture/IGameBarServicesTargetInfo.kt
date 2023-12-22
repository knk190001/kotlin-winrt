package Windows.Media.Capture

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

@ABIMarker(IGameBarServicesTargetInfo.ABI::class)
@Signature("{b4202f92-1611-4e05-b6ef-dfd737ae33b0}")
@Guid("b4202f9216114e05b6efdfd737ae33b0")
@WinRTInterface("b4202f9216114e05b6efdfd737ae33b0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameBarServicesTargetInfo.ByReference::class)
public interface IGameBarServicesTargetInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun get_AppId(): String?

  @InterfaceMethod(2)
  public fun get_TitleId(): String?

  @InterfaceMethod(3)
  public fun get_DisplayMode(): GameBarServicesDisplayMode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameBarServicesTargetInfo> {
    public override fun getValue() = ABI.makeIGameBarServicesTargetInfo(pointer.getPointer(0))

    public fun setValue(value: IGameBarServicesTargetInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameBarServicesTargetInfo {
    public val __545746778_Ptr: Pointer?

    public val _545746778_VtblPtr: Pointer?
      get() = __545746778_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _545746778_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__545746778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AppId(): String? {
      val fnPtr = _545746778_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__545746778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TitleId(): String? {
      val fnPtr = _545746778_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__545746778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DisplayMode(): GameBarServicesDisplayMode? {
      val fnPtr = _545746778_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameBarServicesDisplayMode>()
      val hr = fn.invokeHR(arrayOf(__545746778_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameBarServicesDisplayMode>(result.getValue())
      return resultValue
    }
  }

  public class IGameBarServicesTargetInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __545746778_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameBarServicesTargetInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4202f9216114e05b6efdfd737ae33b0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameBarServicesTargetInfo(ptr: Pointer?): WithDefault =
        IGameBarServicesTargetInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameBarServicesTargetInfo {
      val address = segment.toRawLongValue()
      return makeIGameBarServicesTargetInfo(Pointer(address))
    }

    public override fun toNative(obj: IGameBarServicesTargetInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__545746778_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameBarServicesTargetInfo):
        Array<IGameBarServicesTargetInfo?> = (elements as
        Array<IGameBarServicesTargetInfo?>).castToImpl<IGameBarServicesTargetInfo,IGameBarServicesTargetInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameBarServicesTargetInfo?> =
        arrayOfNulls<IGameBarServicesTargetInfo_Impl>(size) as Array<IGameBarServicesTargetInfo?>
  }
}
