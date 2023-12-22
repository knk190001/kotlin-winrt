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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IElasticEaseStatics.ABI::class)
@Signature("{95fd9290-d279-5857-9f50-3f299a2d02f4}")
@Guid("95fd9290d27958579f503f299a2d02f4")
@WinRTInterface("95fd9290d27958579f503f299a2d02f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IElasticEaseStatics.ByReference::class)
public interface IElasticEaseStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OscillationsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_SpringinessProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IElasticEaseStatics> {
    public override fun getValue() = ABI.makeIElasticEaseStatics(pointer.getPointer(0))

    public fun setValue(value: IElasticEaseStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IElasticEaseStatics {
    public val __1566073059_Ptr: Pointer?

    public val _1566073059_VtblPtr: Pointer?
      get() = __1566073059_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OscillationsProperty(): DependencyProperty? {
      val fnPtr = _1566073059_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1566073059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SpringinessProperty(): DependencyProperty? {
      val fnPtr = _1566073059_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1566073059_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IElasticEaseStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1566073059_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElasticEaseStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95fd9290d27958579f503f299a2d02f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElasticEaseStatics(ptr: Pointer?): WithDefault = IElasticEaseStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElasticEaseStatics {
      val address = segment.toRawLongValue()
      return makeIElasticEaseStatics(Pointer(address))
    }

    public override fun toNative(obj: IElasticEaseStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1566073059_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IElasticEaseStatics): Array<IElasticEaseStatics?> =
        (elements as
        Array<IElasticEaseStatics?>).castToImpl<IElasticEaseStatics,IElasticEaseStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IElasticEaseStatics?> =
        arrayOfNulls<IElasticEaseStatics_Impl>(size) as Array<IElasticEaseStatics?>
  }
}
