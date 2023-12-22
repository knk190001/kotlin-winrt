package Windows.UI.Xaml.Input

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(ILosingFocusEventArgs2.ABI::class)
@Signature("{0493fad9-c27f-469f-8e62-52b3a4f7cd54}")
@Guid("0493fad9c27f469f8e6252b3a4f7cd54")
@WinRTInterface("0493fad9c27f469f8e6252b3a4f7cd54")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILosingFocusEventArgs2.ByReference::class)
public interface ILosingFocusEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCancel(): Boolean

  @InterfaceMethod(1)
  public fun TrySetNewFocusedElement(element: DependencyObject?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILosingFocusEventArgs2> {
    public override fun getValue() = ABI.makeILosingFocusEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ILosingFocusEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILosingFocusEventArgs2 {
    public val __60775061_Ptr: Pointer?

    public val _60775061_VtblPtr: Pointer?
      get() = __60775061_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCancel(): Boolean {
      val fnPtr = _60775061_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__60775061_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TrySetNewFocusedElement(element: DependencyObject?): Boolean {
      val fnPtr = _60775061_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__60775061_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ILosingFocusEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __60775061_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILosingFocusEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0493fad9c27f469f8e6252b3a4f7cd54")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILosingFocusEventArgs2(ptr: Pointer?): WithDefault =
        ILosingFocusEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILosingFocusEventArgs2 {
      val address = segment.toRawLongValue()
      return makeILosingFocusEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ILosingFocusEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__60775061_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILosingFocusEventArgs2): Array<ILosingFocusEventArgs2?> =
        (elements as
        Array<ILosingFocusEventArgs2?>).castToImpl<ILosingFocusEventArgs2,ILosingFocusEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILosingFocusEventArgs2?> =
        arrayOfNulls<ILosingFocusEventArgs2_Impl>(size) as Array<ILosingFocusEventArgs2?>
  }
}
