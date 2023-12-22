package Windows.Media

import Windows.Foundation.Collections.IVector
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMusicDisplayProperties2.ABI::class)
@Signature("{00368462-97d3-44b9-b00f-008afcefaf18}")
@Guid("0036846297d344b9b00f008afcefaf18")
@WinRTInterface("0036846297d344b9b00f008afcefaf18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMusicDisplayProperties2.ByReference::class)
public interface IMusicDisplayProperties2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlbumTitle(): String?

  @InterfaceMethod(1)
  public fun put_AlbumTitle(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_TrackNumber(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_TrackNumber(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_Genres(): IVector<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMusicDisplayProperties2> {
    public override fun getValue() = ABI.makeIMusicDisplayProperties2(pointer.getPointer(0))

    public fun setValue(value: IMusicDisplayProperties2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMusicDisplayProperties2 {
    public val __1217417522_Ptr: Pointer?

    public val _1217417522_VtblPtr: Pointer?
      get() = __1217417522_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlbumTitle(): String? {
      val fnPtr = _1217417522_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1217417522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AlbumTitle(value: String?): Unit {
      val fnPtr = _1217417522_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1217417522_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TrackNumber(): WinDef.UINT {
      val fnPtr = _1217417522_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1217417522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_TrackNumber(value: WinDef.UINT): Unit {
      val fnPtr = _1217417522_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1217417522_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Genres(): IVector<String?>? {
      val fnPtr = _1217417522_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1217417522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }
  }

  public class IMusicDisplayProperties2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1217417522_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMusicDisplayProperties2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0036846297d344b9b00f008afcefaf18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMusicDisplayProperties2(ptr: Pointer?): WithDefault =
        IMusicDisplayProperties2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMusicDisplayProperties2 {
      val address = segment.toRawLongValue()
      return makeIMusicDisplayProperties2(Pointer(address))
    }

    public override fun toNative(obj: IMusicDisplayProperties2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1217417522_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMusicDisplayProperties2):
        Array<IMusicDisplayProperties2?> = (elements as
        Array<IMusicDisplayProperties2?>).castToImpl<IMusicDisplayProperties2,IMusicDisplayProperties2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMusicDisplayProperties2?> =
        arrayOfNulls<IMusicDisplayProperties2_Impl>(size) as Array<IMusicDisplayProperties2?>
  }
}
