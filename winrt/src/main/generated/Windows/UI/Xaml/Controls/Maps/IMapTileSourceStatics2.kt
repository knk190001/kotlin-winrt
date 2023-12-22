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

@ABIMarker(IMapTileSourceStatics2.ABI::class)
@Signature("{75cdd47e-669c-50fd-ad85-5ea5174cf59b}")
@Guid("75cdd47e669c50fdad855ea5174cf59b")
@WinRTInterface("75cdd47e669c50fdad855ea5174cf59b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTileSourceStatics2.ByReference::class)
public interface IMapTileSourceStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AnimationStateProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_AutoPlayProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_FrameCountProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_FrameDurationProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTileSourceStatics2> {
    public override fun getValue() = ABI.makeIMapTileSourceStatics2(pointer.getPointer(0))

    public fun setValue(value: IMapTileSourceStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTileSourceStatics2 {
    public val __425423457_Ptr: Pointer?

    public val _425423457_VtblPtr: Pointer?
      get() = __425423457_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AnimationStateProperty(): DependencyProperty? {
      val fnPtr = _425423457_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__425423457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AutoPlayProperty(): DependencyProperty? {
      val fnPtr = _425423457_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__425423457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FrameCountProperty(): DependencyProperty? {
      val fnPtr = _425423457_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__425423457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FrameDurationProperty(): DependencyProperty? {
      val fnPtr = _425423457_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__425423457_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapTileSourceStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __425423457_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTileSourceStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("75cdd47e669c50fdad855ea5174cf59b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTileSourceStatics2(ptr: Pointer?): WithDefault =
        IMapTileSourceStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTileSourceStatics2 {
      val address = segment.toRawLongValue()
      return makeIMapTileSourceStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMapTileSourceStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__425423457_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTileSourceStatics2): Array<IMapTileSourceStatics2?> =
        (elements as
        Array<IMapTileSourceStatics2?>).castToImpl<IMapTileSourceStatics2,IMapTileSourceStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTileSourceStatics2?> =
        arrayOfNulls<IMapTileSourceStatics2_Impl>(size) as Array<IMapTileSourceStatics2?>
  }
}
