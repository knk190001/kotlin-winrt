package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(ILoopingSelectorStatics.ABI::class)
@Signature("{e7f8770e-729b-57aa-9a79-ede3f84253cc}")
@Guid("e7f8770e729b57aa9a79ede3f84253cc")
@WinRTInterface("e7f8770e729b57aa9a79ede3f84253cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILoopingSelectorStatics.ByReference::class)
public interface ILoopingSelectorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ShouldLoopProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ItemsProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_SelectedIndexProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_SelectedItemProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_ItemWidthProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_ItemHeightProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_ItemTemplateProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILoopingSelectorStatics> {
    public override fun getValue() = ABI.makeILoopingSelectorStatics(pointer.getPointer(0))

    public fun setValue(value: ILoopingSelectorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILoopingSelectorStatics {
    public val __1246097959_Ptr: Pointer?

    public val _1246097959_VtblPtr: Pointer?
      get() = __1246097959_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ShouldLoopProperty(): DependencyProperty? {
      val fnPtr = _1246097959_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1246097959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ItemsProperty(): DependencyProperty? {
      val fnPtr = _1246097959_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1246097959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SelectedIndexProperty(): DependencyProperty? {
      val fnPtr = _1246097959_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1246097959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SelectedItemProperty(): DependencyProperty? {
      val fnPtr = _1246097959_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1246097959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ItemWidthProperty(): DependencyProperty? {
      val fnPtr = _1246097959_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1246097959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ItemHeightProperty(): DependencyProperty? {
      val fnPtr = _1246097959_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1246097959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ItemTemplateProperty(): DependencyProperty? {
      val fnPtr = _1246097959_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1246097959_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ILoopingSelectorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1246097959_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILoopingSelectorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7f8770e729b57aa9a79ede3f84253cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILoopingSelectorStatics(ptr: Pointer?): WithDefault =
        ILoopingSelectorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILoopingSelectorStatics {
      val address = segment.toRawLongValue()
      return makeILoopingSelectorStatics(Pointer(address))
    }

    public override fun toNative(obj: ILoopingSelectorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1246097959_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILoopingSelectorStatics): Array<ILoopingSelectorStatics?>
        = (elements as
        Array<ILoopingSelectorStatics?>).castToImpl<ILoopingSelectorStatics,ILoopingSelectorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILoopingSelectorStatics?> =
        arrayOfNulls<ILoopingSelectorStatics_Impl>(size) as Array<ILoopingSelectorStatics?>
  }
}
