package Windows.ApplicationModel.Core

import Windows.UI.Core.CoreWindow
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

@ABIMarker(IFrameworkView.ABI::class)
@Signature("{faab5cd0-8924-45ac-ad0f-a08fae5d0324}")
@Guid("faab5cd0892445acad0fa08fae5d0324")
@WinRTInterface("faab5cd0892445acad0fa08fae5d0324")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkView.ByReference::class)
public interface IFrameworkView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Initialize(applicationView: CoreApplicationView?): Unit

  @InterfaceMethod(1)
  public fun SetWindow(window: CoreWindow?): Unit

  @InterfaceMethod(2)
  public fun Load(entryPoint: String?): Unit

  @InterfaceMethod(3)
  public fun Run(): Unit

  @InterfaceMethod(4)
  public fun Uninitialize(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFrameworkView>
      {
    public override fun getValue() = ABI.makeIFrameworkView(pointer.getPointer(0))

    public fun setValue(value: IFrameworkView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkView {
    public val __284736419_Ptr: Pointer?

    public val _284736419_VtblPtr: Pointer?
      get() = __284736419_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Initialize(applicationView: CoreApplicationView?): Unit {
      val fnPtr = _284736419_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__284736419_Ptr, marshalToNative(applicationView),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SetWindow(window: CoreWindow?): Unit {
      val fnPtr = _284736419_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__284736419_Ptr, marshalToNative(window),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Load(entryPoint: String?): Unit {
      val fnPtr = _284736419_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__284736419_Ptr, marshalToNative(entryPoint),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun Run(): Unit {
      val fnPtr = _284736419_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__284736419_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun Uninitialize(): Unit {
      val fnPtr = _284736419_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__284736419_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameworkView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __284736419_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("faab5cd0892445acad0fa08fae5d0324")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkView(ptr: Pointer?): WithDefault = IFrameworkView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkView {
      val address = segment.toRawLongValue()
      return makeIFrameworkView(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__284736419_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkView): Array<IFrameworkView?> = (elements as
        Array<IFrameworkView?>).castToImpl<IFrameworkView,IFrameworkView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkView?> =
        arrayOfNulls<IFrameworkView_Impl>(size) as Array<IFrameworkView?>
  }
}
