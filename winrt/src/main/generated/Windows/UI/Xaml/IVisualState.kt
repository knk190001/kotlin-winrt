package Windows.UI.Xaml

import Windows.UI.Xaml.Media.Animation.Storyboard
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

@ABIMarker(IVisualState.ABI::class)
@Signature("{6320affc-c31a-4450-afde-f6ea7bd1f586}")
@Guid("6320affcc31a4450afdef6ea7bd1f586")
@WinRTInterface("6320affcc31a4450afdef6ea7bd1f586")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVisualState.ByReference::class)
public interface IVisualState : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Storyboard(): Storyboard?

  @InterfaceMethod(2)
  public fun put_Storyboard(value: Storyboard?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVisualState> {
    public override fun getValue() = ABI.makeIVisualState(pointer.getPointer(0))

    public fun setValue(value: IVisualState_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVisualState {
    public val __238794849_Ptr: Pointer?

    public val _238794849_VtblPtr: Pointer?
      get() = __238794849_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _238794849_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__238794849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Storyboard(): Storyboard? {
      val fnPtr = _238794849_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Storyboard>()
      val hr = fn.invokeHR(arrayOf(__238794849_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Storyboard>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Storyboard(value: Storyboard?): Unit {
      val fnPtr = _238794849_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__238794849_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IVisualState_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __238794849_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVisualState, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6320affcc31a4450afdef6ea7bd1f586")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVisualState(ptr: Pointer?): WithDefault = IVisualState_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVisualState {
      val address = segment.toRawLongValue()
      return makeIVisualState(Pointer(address))
    }

    public override fun toNative(obj: IVisualState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__238794849_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVisualState): Array<IVisualState?> = (elements as
        Array<IVisualState?>).castToImpl<IVisualState,IVisualState_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVisualState?> =
        arrayOfNulls<IVisualState_Impl>(size) as Array<IVisualState?>
  }
}
