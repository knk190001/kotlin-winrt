package Windows.Devices.PointOfService

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Size
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(ILineDisplayCustomGlyphs.ABI::class)
@Signature("{2257f63c-f263-44f1-a1a0-e750a6a0ec54}")
@Guid("2257f63cf26344f1a1a0e750a6a0ec54")
@WinRTInterface("2257f63cf26344f1a1a0e750a6a0ec54")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplayCustomGlyphs.ByReference::class)
public interface ILineDisplayCustomGlyphs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SizeInPixels(): Size?

  @InterfaceMethod(1)
  public fun get_SupportedGlyphCodes(): IVectorView<WinDef.UINT>?

  @InterfaceMethod(2)
  public fun TryRedefineAsync(glyphCode: WinDef.UINT, glyphData: IBuffer?):
      IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineDisplayCustomGlyphs> {
    public override fun getValue() = ABI.makeILineDisplayCustomGlyphs(pointer.getPointer(0))

    public fun setValue(value: ILineDisplayCustomGlyphs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplayCustomGlyphs {
    public val __28030233_Ptr: Pointer?

    public val _28030233_VtblPtr: Pointer?
      get() = __28030233_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SizeInPixels(): Size? {
      val fnPtr = _28030233_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__28030233_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SupportedGlyphCodes(): IVectorView<WinDef.UINT>? {
      val fnPtr = _28030233_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__28030233_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryRedefineAsync(glyphCode: WinDef.UINT, glyphData: IBuffer?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _28030233_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__28030233_Ptr, glyphCode, marshalToNative(glyphData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ILineDisplayCustomGlyphs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __28030233_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplayCustomGlyphs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2257f63cf26344f1a1a0e750a6a0ec54")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplayCustomGlyphs(ptr: Pointer?): WithDefault =
        ILineDisplayCustomGlyphs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplayCustomGlyphs {
      val address = segment.toRawLongValue()
      return makeILineDisplayCustomGlyphs(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplayCustomGlyphs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__28030233_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplayCustomGlyphs):
        Array<ILineDisplayCustomGlyphs?> = (elements as
        Array<ILineDisplayCustomGlyphs?>).castToImpl<ILineDisplayCustomGlyphs,ILineDisplayCustomGlyphs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplayCustomGlyphs?> =
        arrayOfNulls<ILineDisplayCustomGlyphs_Impl>(size) as Array<ILineDisplayCustomGlyphs?>
  }
}
