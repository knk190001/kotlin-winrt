package Windows.UI.Xaml.Controls

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

@ABIMarker(IHandwritingViewStatics.ABI::class)
@Signature("{bb7ceed0-cc5f-4004-b8c8-142e195f0618}")
@Guid("bb7ceed0cc5f4004b8c8142e195f0618")
@WinRTInterface("bb7ceed0cc5f4004b8c8142e195f0618")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHandwritingViewStatics.ByReference::class)
public interface IHandwritingViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PlacementTargetProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_PlacementAlignmentProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsOpenProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_AreCandidatesEnabledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHandwritingViewStatics> {
    public override fun getValue() = ABI.makeIHandwritingViewStatics(pointer.getPointer(0))

    public fun setValue(value: IHandwritingViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHandwritingViewStatics {
    public val __202774703_Ptr: Pointer?

    public val _202774703_VtblPtr: Pointer?
      get() = __202774703_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PlacementTargetProperty(): DependencyProperty? {
      val fnPtr = _202774703_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__202774703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PlacementAlignmentProperty(): DependencyProperty? {
      val fnPtr = _202774703_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__202774703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsOpenProperty(): DependencyProperty? {
      val fnPtr = _202774703_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__202774703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AreCandidatesEnabledProperty(): DependencyProperty? {
      val fnPtr = _202774703_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__202774703_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IHandwritingViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __202774703_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHandwritingViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb7ceed0cc5f4004b8c8142e195f0618")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHandwritingViewStatics(ptr: Pointer?): WithDefault =
        IHandwritingViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHandwritingViewStatics {
      val address = segment.toRawLongValue()
      return makeIHandwritingViewStatics(Pointer(address))
    }

    public override fun toNative(obj: IHandwritingViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__202774703_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHandwritingViewStatics): Array<IHandwritingViewStatics?>
        = (elements as
        Array<IHandwritingViewStatics?>).castToImpl<IHandwritingViewStatics,IHandwritingViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHandwritingViewStatics?> =
        arrayOfNulls<IHandwritingViewStatics_Impl>(size) as Array<IHandwritingViewStatics?>
  }
}
