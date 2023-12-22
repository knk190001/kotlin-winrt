package Windows.UI.StartScreen

import Windows.Foundation.Uri
import Windows.UI.Color
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISecondaryTileVisualElements.ABI::class)
@Signature("{1d8df333-815e-413f-9f50-a81da70a96b2}")
@Guid("1d8df333815e413f9f50a81da70a96b2")
@WinRTInterface("1d8df333815e413f9f50a81da70a96b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryTileVisualElements.ByReference::class)
public interface ISecondaryTileVisualElements : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Square30x30Logo(value: Uri?): Unit

  @InterfaceMethod(1)
  public fun get_Square30x30Logo(): Uri?

  @InterfaceMethod(2)
  public fun put_Square70x70Logo(value: Uri?): Unit

  @InterfaceMethod(3)
  public fun get_Square70x70Logo(): Uri?

  @InterfaceMethod(4)
  public fun put_Square150x150Logo(value: Uri?): Unit

  @InterfaceMethod(5)
  public fun get_Square150x150Logo(): Uri?

  @InterfaceMethod(6)
  public fun put_Wide310x150Logo(value: Uri?): Unit

  @InterfaceMethod(7)
  public fun get_Wide310x150Logo(): Uri?

  @InterfaceMethod(8)
  public fun put_Square310x310Logo(value: Uri?): Unit

  @InterfaceMethod(9)
  public fun get_Square310x310Logo(): Uri?

  @InterfaceMethod(10)
  public fun put_ForegroundText(value: ForegroundText?): Unit

  @InterfaceMethod(11)
  public fun get_ForegroundText(): ForegroundText?

  @InterfaceMethod(12)
  public fun put_BackgroundColor(value: Color?): Unit

  @InterfaceMethod(13)
  public fun get_BackgroundColor(): Color?

  @InterfaceMethod(14)
  public fun put_ShowNameOnSquare150x150Logo(value: Boolean): Unit

  @InterfaceMethod(15)
  public fun get_ShowNameOnSquare150x150Logo(): Boolean

  @InterfaceMethod(16)
  public fun put_ShowNameOnWide310x150Logo(value: Boolean): Unit

  @InterfaceMethod(17)
  public fun get_ShowNameOnWide310x150Logo(): Boolean

  @InterfaceMethod(18)
  public fun put_ShowNameOnSquare310x310Logo(value: Boolean): Unit

  @InterfaceMethod(19)
  public fun get_ShowNameOnSquare310x310Logo(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryTileVisualElements> {
    public override fun getValue() = ABI.makeISecondaryTileVisualElements(pointer.getPointer(0))

    public fun setValue(value: ISecondaryTileVisualElements_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryTileVisualElements {
    public val __576668017_Ptr: Pointer?

    public val _576668017_VtblPtr: Pointer?
      get() = __576668017_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Square30x30Logo(value: Uri?): Unit {
      val fnPtr = _576668017_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Square30x30Logo(): Uri? {
      val fnPtr = _576668017_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Square70x70Logo(value: Uri?): Unit {
      val fnPtr = _576668017_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Square70x70Logo(): Uri? {
      val fnPtr = _576668017_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Square150x150Logo(value: Uri?): Unit {
      val fnPtr = _576668017_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Square150x150Logo(): Uri? {
      val fnPtr = _576668017_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Wide310x150Logo(value: Uri?): Unit {
      val fnPtr = _576668017_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Wide310x150Logo(): Uri? {
      val fnPtr = _576668017_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Square310x310Logo(value: Uri?): Unit {
      val fnPtr = _576668017_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_Square310x310Logo(): Uri? {
      val fnPtr = _576668017_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun put_ForegroundText(value: ForegroundText?): Unit {
      val fnPtr = _576668017_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_ForegroundText(): ForegroundText? {
      val fnPtr = _576668017_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ForegroundText>()
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ForegroundText>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun put_BackgroundColor(value: Color?): Unit {
      val fnPtr = _576668017_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_BackgroundColor(): Color? {
      val fnPtr = _576668017_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun put_ShowNameOnSquare150x150Logo(value: Boolean): Unit {
      val fnPtr = _576668017_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun get_ShowNameOnSquare150x150Logo(): Boolean {
      val fnPtr = _576668017_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun put_ShowNameOnWide310x150Logo(value: Boolean): Unit {
      val fnPtr = _576668017_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(17)
    public override fun get_ShowNameOnWide310x150Logo(): Boolean {
      val fnPtr = _576668017_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(18)
    public override fun put_ShowNameOnSquare310x310Logo(value: Boolean): Unit {
      val fnPtr = _576668017_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(19)
    public override fun get_ShowNameOnSquare310x310Logo(): Boolean {
      val fnPtr = _576668017_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__576668017_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISecondaryTileVisualElements_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __576668017_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryTileVisualElements, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d8df333815e413f9f50a81da70a96b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryTileVisualElements(ptr: Pointer?): WithDefault =
        ISecondaryTileVisualElements_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISecondaryTileVisualElements {
      val address = segment.toRawLongValue()
      return makeISecondaryTileVisualElements(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryTileVisualElements): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__576668017_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryTileVisualElements):
        Array<ISecondaryTileVisualElements?> = (elements as
        Array<ISecondaryTileVisualElements?>).castToImpl<ISecondaryTileVisualElements,ISecondaryTileVisualElements_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecondaryTileVisualElements?> =
        arrayOfNulls<ISecondaryTileVisualElements_Impl>(size) as
        Array<ISecondaryTileVisualElements?>
  }
}
