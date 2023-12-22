package Windows.Devices.Bluetooth.GenericAttributeProfile

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattPresentationFormat.ABI::class)
@Signature("{196d0021-faad-45dc-ae5b-2ac3184e84db}")
@Guid("196d0021faad45dcae5b2ac3184e84db")
@WinRTInterface("196d0021faad45dcae5b2ac3184e84db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattPresentationFormat.ByReference::class)
public interface IGattPresentationFormat : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FormatType(): Byte

  @InterfaceMethod(1)
  public fun get_Exponent(): Int

  @InterfaceMethod(2)
  public fun get_Unit(): WinDef.USHORT

  @InterfaceMethod(3)
  public fun get_Namespace(): Byte

  @InterfaceMethod(4)
  public fun get_Description(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattPresentationFormat> {
    public override fun getValue() = ABI.makeIGattPresentationFormat(pointer.getPointer(0))

    public fun setValue(value: IGattPresentationFormat_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattPresentationFormat {
    public val __981460908_Ptr: Pointer?

    public val _981460908_VtblPtr: Pointer?
      get() = __981460908_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FormatType(): Byte {
      val fnPtr = _981460908_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__981460908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Exponent(): Int {
      val fnPtr = _981460908_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__981460908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Unit(): WinDef.USHORT {
      val fnPtr = _981460908_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__981460908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Namespace(): Byte {
      val fnPtr = _981460908_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__981460908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Description(): WinDef.USHORT {
      val fnPtr = _981460908_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__981460908_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IGattPresentationFormat_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __981460908_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattPresentationFormat, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("196d0021faad45dcae5b2ac3184e84db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattPresentationFormat(ptr: Pointer?): WithDefault =
        IGattPresentationFormat_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattPresentationFormat {
      val address = segment.toRawLongValue()
      return makeIGattPresentationFormat(Pointer(address))
    }

    public override fun toNative(obj: IGattPresentationFormat): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__981460908_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattPresentationFormat): Array<IGattPresentationFormat?>
        = (elements as
        Array<IGattPresentationFormat?>).castToImpl<IGattPresentationFormat,IGattPresentationFormat_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattPresentationFormat?> =
        arrayOfNulls<IGattPresentationFormat_Impl>(size) as Array<IGattPresentationFormat?>
  }
}
