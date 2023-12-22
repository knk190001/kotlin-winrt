package Microsoft.UI.Xaml.Media.Media3D

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPerspectiveTransform3DStatics.ABI::class)
@Signature("{3b16aa8d-0ee2-5d46-a723-dc8e5c1c0b19}")
@Guid("3b16aa8d0ee25d46a723dc8e5c1c0b19")
@WinRTInterface("3b16aa8d0ee25d46a723dc8e5c1c0b19")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerspectiveTransform3DStatics.ByReference::class)
public interface IPerspectiveTransform3DStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DepthProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_OffsetXProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_OffsetYProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerspectiveTransform3DStatics> {
    public override fun getValue() = ABI.makeIPerspectiveTransform3DStatics(pointer.getPointer(0))

    public fun setValue(value: IPerspectiveTransform3DStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerspectiveTransform3DStatics {
    public val __990554630_Ptr: Pointer?

    public val _990554630_VtblPtr: Pointer?
      get() = __990554630_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DepthProperty(): DependencyProperty? {
      val fnPtr = _990554630_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__990554630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OffsetXProperty(): DependencyProperty? {
      val fnPtr = _990554630_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__990554630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_OffsetYProperty(): DependencyProperty? {
      val fnPtr = _990554630_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__990554630_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPerspectiveTransform3DStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __990554630_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerspectiveTransform3DStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b16aa8d0ee25d46a723dc8e5c1c0b19")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerspectiveTransform3DStatics(ptr: Pointer?): WithDefault =
        IPerspectiveTransform3DStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerspectiveTransform3DStatics {
      val address = segment.toRawLongValue()
      return makeIPerspectiveTransform3DStatics(Pointer(address))
    }

    public override fun toNative(obj: IPerspectiveTransform3DStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__990554630_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerspectiveTransform3DStatics):
        Array<IPerspectiveTransform3DStatics?> = (elements as
        Array<IPerspectiveTransform3DStatics?>).castToImpl<IPerspectiveTransform3DStatics,IPerspectiveTransform3DStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerspectiveTransform3DStatics?> =
        arrayOfNulls<IPerspectiveTransform3DStatics_Impl>(size) as
        Array<IPerspectiveTransform3DStatics?>
  }
}
