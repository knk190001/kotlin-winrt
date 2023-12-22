package Microsoft.UI.Windowing

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

@ABIMarker(IOverlappedPresenter.ABI::class)
@Signature("{21693970-4f4c-5172-9e9d-682a2d174884}")
@Guid("216939704f4c51729e9d682a2d174884")
@WinRTInterface("216939704f4c51729e9d682a2d174884")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOverlappedPresenter.ByReference::class)
public interface IOverlappedPresenter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HasBorder(): Boolean

  @InterfaceMethod(1)
  public fun get_HasTitleBar(): Boolean

  @InterfaceMethod(2)
  public fun get_IsAlwaysOnTop(): Boolean

  @InterfaceMethod(3)
  public fun put_IsAlwaysOnTop(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsMaximizable(): Boolean

  @InterfaceMethod(5)
  public fun put_IsMaximizable(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsMinimizable(): Boolean

  @InterfaceMethod(7)
  public fun put_IsMinimizable(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_IsModal(): Boolean

  @InterfaceMethod(9)
  public fun put_IsModal(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_IsResizable(): Boolean

  @InterfaceMethod(11)
  public fun put_IsResizable(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_State(): OverlappedPresenterState?

  @InterfaceMethod(13)
  public fun Maximize(): Unit

  @InterfaceMethod(14)
  public fun Minimize(): Unit

  @InterfaceMethod(15)
  public fun Restore(): Unit

  @InterfaceMethod(16)
  public fun SetBorderAndTitleBar(hasBorder: Boolean, hasTitleBar: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOverlappedPresenter> {
    public override fun getValue() = ABI.makeIOverlappedPresenter(pointer.getPointer(0))

    public fun setValue(value: IOverlappedPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOverlappedPresenter {
    public val __307680559_Ptr: Pointer?

    public val _307680559_VtblPtr: Pointer?
      get() = __307680559_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HasBorder(): Boolean {
      val fnPtr = _307680559_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_HasTitleBar(): Boolean {
      val fnPtr = _307680559_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsAlwaysOnTop(): Boolean {
      val fnPtr = _307680559_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsAlwaysOnTop(value: Boolean): Unit {
      val fnPtr = _307680559_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsMaximizable(): Boolean {
      val fnPtr = _307680559_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsMaximizable(value: Boolean): Unit {
      val fnPtr = _307680559_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsMinimizable(): Boolean {
      val fnPtr = _307680559_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsMinimizable(value: Boolean): Unit {
      val fnPtr = _307680559_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_IsModal(): Boolean {
      val fnPtr = _307680559_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_IsModal(value: Boolean): Unit {
      val fnPtr = _307680559_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsResizable(): Boolean {
      val fnPtr = _307680559_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsResizable(value: Boolean): Unit {
      val fnPtr = _307680559_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_State(): OverlappedPresenterState? {
      val fnPtr = _307680559_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OverlappedPresenterState>()
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OverlappedPresenterState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun Maximize(): Unit {
      val fnPtr = _307680559_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun Minimize(): Unit {
      val fnPtr = _307680559_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun Restore(): Unit {
      val fnPtr = _307680559_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun SetBorderAndTitleBar(hasBorder: Boolean, hasTitleBar: Boolean): Unit {
      val fnPtr = _307680559_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__307680559_Ptr, hasBorder, hasTitleBar,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IOverlappedPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __307680559_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOverlappedPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("216939704f4c51729e9d682a2d174884")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOverlappedPresenter(ptr: Pointer?): WithDefault = IOverlappedPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOverlappedPresenter {
      val address = segment.toRawLongValue()
      return makeIOverlappedPresenter(Pointer(address))
    }

    public override fun toNative(obj: IOverlappedPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__307680559_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOverlappedPresenter): Array<IOverlappedPresenter?> =
        (elements as
        Array<IOverlappedPresenter?>).castToImpl<IOverlappedPresenter,IOverlappedPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOverlappedPresenter?> =
        arrayOfNulls<IOverlappedPresenter_Impl>(size) as Array<IOverlappedPresenter?>
  }
}
