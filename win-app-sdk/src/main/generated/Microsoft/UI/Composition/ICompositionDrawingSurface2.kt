package Microsoft.UI.Composition

import Windows.Graphics.PointInt32
import Windows.Graphics.RectInt32
import Windows.Graphics.SizeInt32
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionDrawingSurface2.ABI::class)
@Signature("{6be6f652-bec8-5adf-a6af-5acfc00a968e}")
@Guid("6be6f652bec85adfa6af5acfc00a968e")
@WinRTInterface("6be6f652bec85adfa6af5acfc00a968e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionDrawingSurface2.ByReference::class)
public interface ICompositionDrawingSurface2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SizeInt32(): SizeInt32?

  @InterfaceMethod(1)
  public fun Resize(sizePixels: SizeInt32?): Unit

  @InterfaceMethod(2)
  public fun Scroll(offset: PointInt32?): Unit

  @InterfaceMethod(3)
  public fun Scroll(offset: PointInt32?, scrollRect: RectInt32?): Unit

  @InterfaceMethod(4)
  public fun ScrollWithClip(offset: PointInt32?, clipRect: RectInt32?): Unit

  @InterfaceMethod(5)
  public fun ScrollWithClip(
    offset: PointInt32?,
    clipRect: RectInt32?,
    scrollRect: RectInt32?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionDrawingSurface2> {
    public override fun getValue() = ABI.makeICompositionDrawingSurface2(pointer.getPointer(0))

    public fun setValue(value: ICompositionDrawingSurface2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionDrawingSurface2 {
    public val __1392471246_Ptr: Pointer?

    public val _1392471246_VtblPtr: Pointer?
      get() = __1392471246_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SizeInt32(): SizeInt32? {
      val fnPtr = _1392471246_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__1392471246_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Resize(sizePixels: SizeInt32?): Unit {
      val fnPtr = _1392471246_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1392471246_Ptr, marshalToNative(sizePixels),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Scroll(offset: PointInt32?): Unit {
      val fnPtr = _1392471246_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1392471246_Ptr, marshalToNative(offset),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Scroll(offset: PointInt32?, scrollRect: RectInt32?): Unit {
      val fnPtr = _1392471246_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1392471246_Ptr, marshalToNative(offset),
          marshalToNative(scrollRect),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun ScrollWithClip(offset: PointInt32?, clipRect: RectInt32?): Unit {
      val fnPtr = _1392471246_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1392471246_Ptr, marshalToNative(offset),
          marshalToNative(clipRect),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ScrollWithClip(
      offset: PointInt32?,
      clipRect: RectInt32?,
      scrollRect: RectInt32?
    ): Unit {
      val fnPtr = _1392471246_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1392471246_Ptr, marshalToNative(offset),
          marshalToNative(clipRect), marshalToNative(scrollRect),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionDrawingSurface2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1392471246_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionDrawingSurface2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6be6f652bec85adfa6af5acfc00a968e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionDrawingSurface2(ptr: Pointer?): WithDefault =
        ICompositionDrawingSurface2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionDrawingSurface2 {
      val address = segment.toRawLongValue()
      return makeICompositionDrawingSurface2(Pointer(address))
    }

    public override fun toNative(obj: ICompositionDrawingSurface2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1392471246_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionDrawingSurface2):
        Array<ICompositionDrawingSurface2?> = (elements as
        Array<ICompositionDrawingSurface2?>).castToImpl<ICompositionDrawingSurface2,ICompositionDrawingSurface2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionDrawingSurface2?> =
        arrayOfNulls<ICompositionDrawingSurface2_Impl>(size) as Array<ICompositionDrawingSurface2?>
  }
}
