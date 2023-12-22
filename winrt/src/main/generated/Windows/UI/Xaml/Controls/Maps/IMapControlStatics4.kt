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

@ABIMarker(IMapControlStatics4.ABI::class)
@Signature("{fe785d97-5d13-4fa1-bf1d-84061768c183}")
@Guid("fe785d975d134fa1bf1d84061768c183")
@WinRTInterface("fe785d975d134fa1bf1d84061768c183")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlStatics4.ByReference::class)
public interface IMapControlStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BusinessLandmarksEnabledProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TransitFeaturesEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlStatics4> {
    public override fun getValue() = ABI.makeIMapControlStatics4(pointer.getPointer(0))

    public fun setValue(value: IMapControlStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlStatics4 {
    public val __142000223_Ptr: Pointer?

    public val _142000223_VtblPtr: Pointer?
      get() = __142000223_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BusinessLandmarksEnabledProperty(): DependencyProperty? {
      val fnPtr = _142000223_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000223_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TransitFeaturesEnabledProperty(): DependencyProperty? {
      val fnPtr = _142000223_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__142000223_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __142000223_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fe785d975d134fa1bf1d84061768c183")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlStatics4(ptr: Pointer?): WithDefault = IMapControlStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControlStatics4 {
      val address = segment.toRawLongValue()
      return makeIMapControlStatics4(Pointer(address))
    }

    public override fun toNative(obj: IMapControlStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__142000223_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlStatics4): Array<IMapControlStatics4?> =
        (elements as
        Array<IMapControlStatics4?>).castToImpl<IMapControlStatics4,IMapControlStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlStatics4?> =
        arrayOfNulls<IMapControlStatics4_Impl>(size) as Array<IMapControlStatics4?>
  }
}
