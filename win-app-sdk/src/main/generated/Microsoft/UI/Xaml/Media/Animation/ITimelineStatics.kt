package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(ITimelineStatics.ABI::class)
@Signature("{778b8471-c831-503a-8748-fe6bbc7153b7}")
@Guid("778b8471c831503a8748fe6bbc7153b7")
@WinRTInterface("778b8471c831503a8748fe6bbc7153b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimelineStatics.ByReference::class)
public interface ITimelineStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowDependentAnimations(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowDependentAnimations(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_AutoReverseProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_BeginTimeProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_DurationProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_SpeedRatioProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_FillBehaviorProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_RepeatBehaviorProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimelineStatics> {
    public override fun getValue() = ABI.makeITimelineStatics(pointer.getPointer(0))

    public fun setValue(value: ITimelineStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimelineStatics {
    public val __831153385_Ptr: Pointer?

    public val _831153385_VtblPtr: Pointer?
      get() = __831153385_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowDependentAnimations(): Boolean {
      val fnPtr = _831153385_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__831153385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowDependentAnimations(value: Boolean): Unit {
      val fnPtr = _831153385_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__831153385_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AutoReverseProperty(): DependencyProperty? {
      val fnPtr = _831153385_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__831153385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BeginTimeProperty(): DependencyProperty? {
      val fnPtr = _831153385_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__831153385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DurationProperty(): DependencyProperty? {
      val fnPtr = _831153385_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__831153385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SpeedRatioProperty(): DependencyProperty? {
      val fnPtr = _831153385_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__831153385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_FillBehaviorProperty(): DependencyProperty? {
      val fnPtr = _831153385_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__831153385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_RepeatBehaviorProperty(): DependencyProperty? {
      val fnPtr = _831153385_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__831153385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITimelineStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __831153385_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimelineStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("778b8471c831503a8748fe6bbc7153b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimelineStatics(ptr: Pointer?): WithDefault = ITimelineStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimelineStatics {
      val address = segment.toRawLongValue()
      return makeITimelineStatics(Pointer(address))
    }

    public override fun toNative(obj: ITimelineStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__831153385_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimelineStatics): Array<ITimelineStatics?> = (elements as
        Array<ITimelineStatics?>).castToImpl<ITimelineStatics,ITimelineStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimelineStatics?> =
        arrayOfNulls<ITimelineStatics_Impl>(size) as Array<ITimelineStatics?>
  }
}
