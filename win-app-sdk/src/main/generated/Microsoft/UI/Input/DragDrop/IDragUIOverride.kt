package Microsoft.UI.Input.DragDrop

import Windows.Foundation.Point
import Windows.Graphics.Imaging.SoftwareBitmap
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDragUIOverride.ABI::class)
@Signature("{8432fbac-a17f-5a95-8f56-fb432280b54d}")
@Guid("8432fbaca17f5a958f56fb432280b54d")
@WinRTInterface("8432fbaca17f5a958f56fb432280b54d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragUIOverride.ByReference::class)
public interface IDragUIOverride : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Caption(): String?

  @InterfaceMethod(1)
  public fun put_Caption(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_IsCaptionVisible(): Boolean

  @InterfaceMethod(3)
  public fun put_IsCaptionVisible(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsContentVisible(): Boolean

  @InterfaceMethod(5)
  public fun put_IsContentVisible(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsGlyphVisible(): Boolean

  @InterfaceMethod(7)
  public fun put_IsGlyphVisible(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun Clear(): Unit

  @InterfaceMethod(9)
  public fun SetContentFromSoftwareBitmap(bitmap: SoftwareBitmap?): Unit

  @InterfaceMethod(10)
  public fun SetContentFromSoftwareBitmap(bitmap: SoftwareBitmap?, anchorPoint: Point?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragUIOverride> {
    public override fun getValue() = ABI.makeIDragUIOverride(pointer.getPointer(0))

    public fun setValue(value: IDragUIOverride_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragUIOverride {
    public val __306234268_Ptr: Pointer?

    public val _306234268_VtblPtr: Pointer?
      get() = __306234268_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Caption(): String? {
      val fnPtr = _306234268_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__306234268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Caption(value: String?): Unit {
      val fnPtr = _306234268_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__306234268_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsCaptionVisible(): Boolean {
      val fnPtr = _306234268_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__306234268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsCaptionVisible(value: Boolean): Unit {
      val fnPtr = _306234268_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__306234268_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsContentVisible(): Boolean {
      val fnPtr = _306234268_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__306234268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsContentVisible(value: Boolean): Unit {
      val fnPtr = _306234268_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__306234268_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsGlyphVisible(): Boolean {
      val fnPtr = _306234268_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__306234268_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsGlyphVisible(value: Boolean): Unit {
      val fnPtr = _306234268_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__306234268_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun Clear(): Unit {
      val fnPtr = _306234268_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__306234268_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SetContentFromSoftwareBitmap(bitmap: SoftwareBitmap?): Unit {
      val fnPtr = _306234268_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__306234268_Ptr, marshalToNative(bitmap),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun SetContentFromSoftwareBitmap(bitmap: SoftwareBitmap?, anchorPoint: Point?):
        Unit {
      val fnPtr = _306234268_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__306234268_Ptr, marshalToNative(bitmap),
          marshalToNative(anchorPoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDragUIOverride_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __306234268_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragUIOverride, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8432fbaca17f5a958f56fb432280b54d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragUIOverride(ptr: Pointer?): WithDefault = IDragUIOverride_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragUIOverride {
      val address = segment.toRawLongValue()
      return makeIDragUIOverride(Pointer(address))
    }

    public override fun toNative(obj: IDragUIOverride): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__306234268_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragUIOverride): Array<IDragUIOverride?> = (elements as
        Array<IDragUIOverride?>).castToImpl<IDragUIOverride,IDragUIOverride_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragUIOverride?> =
        arrayOfNulls<IDragUIOverride_Impl>(size) as Array<IDragUIOverride?>
  }
}
