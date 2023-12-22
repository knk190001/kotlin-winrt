package Windows.UI.Xaml.Controls.Maps

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(IMapBillboardStatics.ABI::class)
@Signature("{fdf839fe-e1f7-4fb0-8887-7da68c647333}")
@Guid("fdf839fee1f74fb088877da68c647333")
@WinRTInterface("fdf839fee1f74fb088877da68c647333")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapBillboardStatics.ByReference::class)
public interface IMapBillboardStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocationProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_NormalizedAnchorPointProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_CollisionBehaviorDesiredProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapBillboardStatics> {
    public override fun getValue() = ABI.makeIMapBillboardStatics(pointer.getPointer(0))

    public fun setValue(value: IMapBillboardStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapBillboardStatics {
    public val __1544070161_Ptr: Pointer?

    public val _1544070161_VtblPtr: Pointer?
      get() = __1544070161_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocationProperty(): DependencyProperty? {
      val fnPtr = _1544070161_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1544070161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NormalizedAnchorPointProperty(): DependencyProperty? {
      val fnPtr = _1544070161_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1544070161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CollisionBehaviorDesiredProperty(): DependencyProperty? {
      val fnPtr = _1544070161_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1544070161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapBillboardStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1544070161_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapBillboardStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fdf839fee1f74fb088877da68c647333")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapBillboardStatics(ptr: Pointer?): WithDefault = IMapBillboardStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapBillboardStatics {
      val address = segment.toRawLongValue()
      return makeIMapBillboardStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapBillboardStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1544070161_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapBillboardStatics): Array<IMapBillboardStatics?> =
        (elements as
        Array<IMapBillboardStatics?>).castToImpl<IMapBillboardStatics,IMapBillboardStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapBillboardStatics?> =
        arrayOfNulls<IMapBillboardStatics_Impl>(size) as Array<IMapBillboardStatics?>
  }
}
