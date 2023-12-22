package Windows.Services.Maps

import Windows.Devices.Geolocation.IGeoshape
import Windows.Foundation.Rect
import Windows.UI.Popups.Placement
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

@ABIMarker(IPlaceInfo.ABI::class)
@Signature("{9a0810b6-31c8-4f6a-9f18-950b4c38951a}")
@Guid("9a0810b631c84f6a9f18950b4c38951a")
@WinRTInterface("9a0810b631c84f6a9f18950b4c38951a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaceInfo.ByReference::class)
public interface IPlaceInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Show(selection: Rect?): Unit

  @InterfaceMethod(1)
  public fun Show(selection: Rect?, preferredPlacement: Placement?): Unit

  @InterfaceMethod(2)
  public fun get_Identifier(): String?

  @InterfaceMethod(3)
  public fun get_DisplayName(): String?

  @InterfaceMethod(4)
  public fun get_DisplayAddress(): String?

  @InterfaceMethod(5)
  public fun get_Geoshape(): IGeoshape?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPlaceInfo> {
    public override fun getValue() = ABI.makeIPlaceInfo(pointer.getPointer(0))

    public fun setValue(value: IPlaceInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaceInfo {
    public val __589103384_Ptr: Pointer?

    public val _589103384_VtblPtr: Pointer?
      get() = __589103384_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Show(selection: Rect?): Unit {
      val fnPtr = _589103384_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__589103384_Ptr, marshalToNative(selection),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Show(selection: Rect?, preferredPlacement: Placement?): Unit {
      val fnPtr = _589103384_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__589103384_Ptr, marshalToNative(selection),
          marshalToNative(preferredPlacement),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Identifier(): String? {
      val fnPtr = _589103384_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__589103384_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DisplayName(): String? {
      val fnPtr = _589103384_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__589103384_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DisplayAddress(): String? {
      val fnPtr = _589103384_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__589103384_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Geoshape(): IGeoshape? {
      val fnPtr = _589103384_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IGeoshape>()
      val hr = fn.invokeHR(arrayOf(__589103384_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IGeoshape>(result.getValue())
      return resultValue
    }
  }

  public class IPlaceInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __589103384_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaceInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a0810b631c84f6a9f18950b4c38951a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaceInfo(ptr: Pointer?): WithDefault = IPlaceInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaceInfo {
      val address = segment.toRawLongValue()
      return makeIPlaceInfo(Pointer(address))
    }

    public override fun toNative(obj: IPlaceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__589103384_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaceInfo): Array<IPlaceInfo?> = (elements as
        Array<IPlaceInfo?>).castToImpl<IPlaceInfo,IPlaceInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaceInfo?> = arrayOfNulls<IPlaceInfo_Impl>(size)
        as Array<IPlaceInfo?>
  }
}
