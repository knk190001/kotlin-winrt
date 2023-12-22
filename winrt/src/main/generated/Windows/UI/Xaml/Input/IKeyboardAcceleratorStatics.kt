package Windows.UI.Xaml.Input

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

@ABIMarker(IKeyboardAcceleratorStatics.ABI::class)
@Signature("{3bd43d51-9bb3-456d-bf15-804adfb86261}")
@Guid("3bd43d519bb3456dbf15804adfb86261")
@WinRTInterface("3bd43d519bb3456dbf15804adfb86261")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyboardAcceleratorStatics.ByReference::class)
public interface IKeyboardAcceleratorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ModifiersProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsEnabledProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_ScopeOwnerProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyboardAcceleratorStatics> {
    public override fun getValue() = ABI.makeIKeyboardAcceleratorStatics(pointer.getPointer(0))

    public fun setValue(value: IKeyboardAcceleratorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyboardAcceleratorStatics {
    public val __952270217_Ptr: Pointer?

    public val _952270217_VtblPtr: Pointer?
      get() = __952270217_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyProperty(): DependencyProperty? {
      val fnPtr = _952270217_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__952270217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ModifiersProperty(): DependencyProperty? {
      val fnPtr = _952270217_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__952270217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsEnabledProperty(): DependencyProperty? {
      val fnPtr = _952270217_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__952270217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ScopeOwnerProperty(): DependencyProperty? {
      val fnPtr = _952270217_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__952270217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IKeyboardAcceleratorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __952270217_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyboardAcceleratorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3bd43d519bb3456dbf15804adfb86261")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyboardAcceleratorStatics(ptr: Pointer?): WithDefault =
        IKeyboardAcceleratorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyboardAcceleratorStatics {
      val address = segment.toRawLongValue()
      return makeIKeyboardAcceleratorStatics(Pointer(address))
    }

    public override fun toNative(obj: IKeyboardAcceleratorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__952270217_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyboardAcceleratorStatics):
        Array<IKeyboardAcceleratorStatics?> = (elements as
        Array<IKeyboardAcceleratorStatics?>).castToImpl<IKeyboardAcceleratorStatics,IKeyboardAcceleratorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyboardAcceleratorStatics?> =
        arrayOfNulls<IKeyboardAcceleratorStatics_Impl>(size) as Array<IKeyboardAcceleratorStatics?>
  }
}
