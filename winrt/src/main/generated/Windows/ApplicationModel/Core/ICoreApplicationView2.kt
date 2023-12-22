package Windows.ApplicationModel.Core

import Windows.UI.Core.CoreDispatcher
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

@ABIMarker(ICoreApplicationView2.ABI::class)
@Signature("{68eb7adf-917f-48eb-9aeb-7de53e086ab1}")
@Guid("68eb7adf917f48eb9aeb7de53e086ab1")
@WinRTInterface("68eb7adf917f48eb9aeb7de53e086ab1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreApplicationView2.ByReference::class)
public interface ICoreApplicationView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Dispatcher(): CoreDispatcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreApplicationView2> {
    public override fun getValue() = ABI.makeICoreApplicationView2(pointer.getPointer(0))

    public fun setValue(value: ICoreApplicationView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreApplicationView2 {
    public val __503948956_Ptr: Pointer?

    public val _503948956_VtblPtr: Pointer?
      get() = __503948956_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Dispatcher(): CoreDispatcher? {
      val fnPtr = _503948956_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreDispatcher>()
      val hr = fn.invokeHR(arrayOf(__503948956_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreDispatcher>(result.getValue())
      return resultValue
    }
  }

  public class ICoreApplicationView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __503948956_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreApplicationView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68eb7adf917f48eb9aeb7de53e086ab1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreApplicationView2(ptr: Pointer?): WithDefault =
        ICoreApplicationView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreApplicationView2 {
      val address = segment.toRawLongValue()
      return makeICoreApplicationView2(Pointer(address))
    }

    public override fun toNative(obj: ICoreApplicationView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__503948956_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreApplicationView2): Array<ICoreApplicationView2?> =
        (elements as
        Array<ICoreApplicationView2?>).castToImpl<ICoreApplicationView2,ICoreApplicationView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreApplicationView2?> =
        arrayOfNulls<ICoreApplicationView2_Impl>(size) as Array<ICoreApplicationView2?>
  }
}
