package Microsoft.UI.Content

import Microsoft.UI.WindowId
import Windows.Graphics.RectInt32
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

@ABIMarker(IDesktopSiteBridge.ABI::class)
@Signature("{f0ae8750-905c-50a2-8a12-4545c6245bb4}")
@Guid("f0ae8750905c50a28a124545c6245bb4")
@WinRTInterface("f0ae8750905c50a28a124545c6245bb4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopSiteBridge.ByReference::class)
public interface IDesktopSiteBridge : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(1)
  public fun get_IsVisible(): Boolean

  @InterfaceMethod(2)
  public fun get_WindowId(): WindowId?

  @InterfaceMethod(3)
  public fun Connect(content: ContentIsland?): Unit

  @InterfaceMethod(4)
  public fun Disable(): Unit

  @InterfaceMethod(5)
  public fun Enable(): Unit

  @InterfaceMethod(6)
  public fun Hide(): Unit

  @InterfaceMethod(7)
  public fun MoveAndResize(rect: RectInt32?): Unit

  @InterfaceMethod(8)
  public fun MoveInZOrderAtBottom(): Unit

  @InterfaceMethod(9)
  public fun MoveInZOrderAtTop(): Unit

  @InterfaceMethod(10)
  public fun MoveInZOrderBelow(windowId: WindowId?): Unit

  @InterfaceMethod(11)
  public fun Show(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopSiteBridge> {
    public override fun getValue() = ABI.makeIDesktopSiteBridge(pointer.getPointer(0))

    public fun setValue(value: IDesktopSiteBridge_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopSiteBridge {
    public val __2052135938_Ptr: Pointer?

    public val _2052135938_VtblPtr: Pointer?
      get() = __2052135938_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _2052135938_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2052135938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsVisible(): Boolean {
      val fnPtr = _2052135938_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2052135938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_WindowId(): WindowId? {
      val fnPtr = _2052135938_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowId>()
      val hr = fn.invokeHR(arrayOf(__2052135938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Connect(content: ContentIsland?): Unit {
      val fnPtr = _2052135938_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2052135938_Ptr, marshalToNative(content),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Disable(): Unit {
      val fnPtr = _2052135938_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2052135938_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Enable(): Unit {
      val fnPtr = _2052135938_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2052135938_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Hide(): Unit {
      val fnPtr = _2052135938_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2052135938_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun MoveAndResize(rect: RectInt32?): Unit {
      val fnPtr = _2052135938_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2052135938_Ptr, marshalToNative(rect),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun MoveInZOrderAtBottom(): Unit {
      val fnPtr = _2052135938_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2052135938_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun MoveInZOrderAtTop(): Unit {
      val fnPtr = _2052135938_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2052135938_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun MoveInZOrderBelow(windowId: WindowId?): Unit {
      val fnPtr = _2052135938_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2052135938_Ptr, marshalToNative(windowId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun Show(): Unit {
      val fnPtr = _2052135938_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2052135938_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDesktopSiteBridge_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2052135938_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopSiteBridge, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f0ae8750905c50a28a124545c6245bb4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopSiteBridge(ptr: Pointer?): WithDefault = IDesktopSiteBridge_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopSiteBridge {
      val address = segment.toRawLongValue()
      return makeIDesktopSiteBridge(Pointer(address))
    }

    public override fun toNative(obj: IDesktopSiteBridge): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2052135938_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopSiteBridge): Array<IDesktopSiteBridge?> =
        (elements as
        Array<IDesktopSiteBridge?>).castToImpl<IDesktopSiteBridge,IDesktopSiteBridge_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopSiteBridge?> =
        arrayOfNulls<IDesktopSiteBridge_Impl>(size) as Array<IDesktopSiteBridge?>
  }
}
