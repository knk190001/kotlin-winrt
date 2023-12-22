package Windows.Storage

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

@ABIMarker(ISystemVideoProperties.ABI::class)
@Signature("{2040f715-67f8-4322-9b80-4fa9fefb83e8}")
@Guid("2040f71567f843229b804fa9fefb83e8")
@WinRTInterface("2040f71567f843229b804fa9fefb83e8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemVideoProperties.ByReference::class)
public interface ISystemVideoProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Director(): String?

  @InterfaceMethod(1)
  public fun get_FrameHeight(): String?

  @InterfaceMethod(2)
  public fun get_FrameWidth(): String?

  @InterfaceMethod(3)
  public fun get_Orientation(): String?

  @InterfaceMethod(4)
  public fun get_TotalBitrate(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemVideoProperties> {
    public override fun getValue() = ABI.makeISystemVideoProperties(pointer.getPointer(0))

    public fun setValue(value: ISystemVideoProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemVideoProperties {
    public val __657096986_Ptr: Pointer?

    public val _657096986_VtblPtr: Pointer?
      get() = __657096986_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Director(): String? {
      val fnPtr = _657096986_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__657096986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FrameHeight(): String? {
      val fnPtr = _657096986_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__657096986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FrameWidth(): String? {
      val fnPtr = _657096986_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__657096986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Orientation(): String? {
      val fnPtr = _657096986_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__657096986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_TotalBitrate(): String? {
      val fnPtr = _657096986_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__657096986_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISystemVideoProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __657096986_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemVideoProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2040f71567f843229b804fa9fefb83e8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemVideoProperties(ptr: Pointer?): WithDefault =
        ISystemVideoProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemVideoProperties {
      val address = segment.toRawLongValue()
      return makeISystemVideoProperties(Pointer(address))
    }

    public override fun toNative(obj: ISystemVideoProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__657096986_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemVideoProperties): Array<ISystemVideoProperties?> =
        (elements as
        Array<ISystemVideoProperties?>).castToImpl<ISystemVideoProperties,ISystemVideoProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemVideoProperties?> =
        arrayOfNulls<ISystemVideoProperties_Impl>(size) as Array<ISystemVideoProperties?>
  }
}
