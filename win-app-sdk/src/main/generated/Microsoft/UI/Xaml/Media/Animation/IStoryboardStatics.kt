package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyObject
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStoryboardStatics.ABI::class)
@Signature("{dd18519b-d4e4-597d-a0b7-655ebdd35efa}")
@Guid("dd18519bd4e4597da0b7655ebdd35efa")
@WinRTInterface("dd18519bd4e4597da0b7655ebdd35efa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoryboardStatics.ByReference::class)
public interface IStoryboardStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetPropertyProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun GetTargetProperty(element: Timeline?): String?

  @InterfaceMethod(2)
  public fun SetTargetProperty(element: Timeline?, path: String?): Unit

  @InterfaceMethod(3)
  public fun get_TargetNameProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun GetTargetName(element: Timeline?): String?

  @InterfaceMethod(5)
  public fun SetTargetName(element: Timeline?, name: String?): Unit

  @InterfaceMethod(6)
  public fun SetTarget(timeline: Timeline?, target: DependencyObject?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoryboardStatics> {
    public override fun getValue() = ABI.makeIStoryboardStatics(pointer.getPointer(0))

    public fun setValue(value: IStoryboardStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoryboardStatics {
    public val __1059417383_Ptr: Pointer?

    public val _1059417383_VtblPtr: Pointer?
      get() = __1059417383_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetPropertyProperty(): DependencyProperty? {
      val fnPtr = _1059417383_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1059417383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetTargetProperty(element: Timeline?): String? {
      val fnPtr = _1059417383_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1059417383_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetTargetProperty(element: Timeline?, path: String?): Unit {
      val fnPtr = _1059417383_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1059417383_Ptr, marshalToNative(element),
          marshalToNative(path),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_TargetNameProperty(): DependencyProperty? {
      val fnPtr = _1059417383_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1059417383_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetTargetName(element: Timeline?): String? {
      val fnPtr = _1059417383_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1059417383_Ptr, marshalToNative(element), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetTargetName(element: Timeline?, name: String?): Unit {
      val fnPtr = _1059417383_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1059417383_Ptr, marshalToNative(element),
          marshalToNative(name),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetTarget(timeline: Timeline?, target: DependencyObject?): Unit {
      val fnPtr = _1059417383_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1059417383_Ptr, marshalToNative(timeline),
          marshalToNative(target),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStoryboardStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1059417383_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoryboardStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd18519bd4e4597da0b7655ebdd35efa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoryboardStatics(ptr: Pointer?): WithDefault = IStoryboardStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoryboardStatics {
      val address = segment.toRawLongValue()
      return makeIStoryboardStatics(Pointer(address))
    }

    public override fun toNative(obj: IStoryboardStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1059417383_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoryboardStatics): Array<IStoryboardStatics?> =
        (elements as
        Array<IStoryboardStatics?>).castToImpl<IStoryboardStatics,IStoryboardStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoryboardStatics?> =
        arrayOfNulls<IStoryboardStatics_Impl>(size) as Array<IStoryboardStatics?>
  }
}
