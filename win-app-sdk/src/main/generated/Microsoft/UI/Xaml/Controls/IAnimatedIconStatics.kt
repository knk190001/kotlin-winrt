package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IAnimatedIconStatics.ABI::class)
@Signature("{51cc5230-a001-55ff-9fc8-bd51b2a3277b}")
@Guid("51cc5230a00155ff9fc8bd51b2a3277b")
@WinRTInterface("51cc5230a00155ff9fc8bd51b2a3277b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnimatedIconStatics.ByReference::class)
public interface IAnimatedIconStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StateProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun SetState(`object`: DependencyObject?, value: String?): Unit

  @InterfaceMethod(2)
  public fun GetState(`object`: DependencyObject?): String?

  @InterfaceMethod(3)
  public fun get_SourceProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_FallbackIconSourceProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_MirroredWhenRightToLeftProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnimatedIconStatics> {
    public override fun getValue() = ABI.makeIAnimatedIconStatics(pointer.getPointer(0))

    public fun setValue(value: IAnimatedIconStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnimatedIconStatics {
    public val __1975448130_Ptr: Pointer?

    public val _1975448130_VtblPtr: Pointer?
      get() = __1975448130_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StateProperty(): DependencyProperty? {
      val fnPtr = _1975448130_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1975448130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetState(`object`: DependencyObject?, value: String?): Unit {
      val fnPtr = _1975448130_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1975448130_Ptr, marshalToNative(`object`),
          marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetState(`object`: DependencyObject?): String? {
      val fnPtr = _1975448130_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1975448130_Ptr, marshalToNative(`object`), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SourceProperty(): DependencyProperty? {
      val fnPtr = _1975448130_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1975448130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_FallbackIconSourceProperty(): DependencyProperty? {
      val fnPtr = _1975448130_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1975448130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MirroredWhenRightToLeftProperty(): DependencyProperty? {
      val fnPtr = _1975448130_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1975448130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IAnimatedIconStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1975448130_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnimatedIconStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("51cc5230a00155ff9fc8bd51b2a3277b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnimatedIconStatics(ptr: Pointer?): WithDefault = IAnimatedIconStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnimatedIconStatics {
      val address = segment.toRawLongValue()
      return makeIAnimatedIconStatics(Pointer(address))
    }

    public override fun toNative(obj: IAnimatedIconStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1975448130_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnimatedIconStatics): Array<IAnimatedIconStatics?> =
        (elements as
        Array<IAnimatedIconStatics?>).castToImpl<IAnimatedIconStatics,IAnimatedIconStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnimatedIconStatics?> =
        arrayOfNulls<IAnimatedIconStatics_Impl>(size) as Array<IAnimatedIconStatics?>
  }
}
