package Microsoft.UI.Xaml.Media

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

@ABIMarker(IPathFigureStatics.ABI::class)
@Signature("{93bc33c4-879a-5edb-b8d7-7ecb861a7314}")
@Guid("93bc33c4879a5edbb8d77ecb861a7314")
@WinRTInterface("93bc33c4879a5edbb8d77ecb861a7314")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathFigureStatics.ByReference::class)
public interface IPathFigureStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SegmentsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_StartPointProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_IsClosedProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_IsFilledProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPathFigureStatics> {
    public override fun getValue() = ABI.makeIPathFigureStatics(pointer.getPointer(0))

    public fun setValue(value: IPathFigureStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathFigureStatics {
    public val __2112912373_Ptr: Pointer?

    public val _2112912373_VtblPtr: Pointer?
      get() = __2112912373_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SegmentsProperty(): DependencyProperty? {
      val fnPtr = _2112912373_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2112912373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_StartPointProperty(): DependencyProperty? {
      val fnPtr = _2112912373_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2112912373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsClosedProperty(): DependencyProperty? {
      val fnPtr = _2112912373_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2112912373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsFilledProperty(): DependencyProperty? {
      val fnPtr = _2112912373_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__2112912373_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPathFigureStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2112912373_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathFigureStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93bc33c4879a5edbb8d77ecb861a7314")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathFigureStatics(ptr: Pointer?): WithDefault = IPathFigureStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathFigureStatics {
      val address = segment.toRawLongValue()
      return makeIPathFigureStatics(Pointer(address))
    }

    public override fun toNative(obj: IPathFigureStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2112912373_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathFigureStatics): Array<IPathFigureStatics?> =
        (elements as
        Array<IPathFigureStatics?>).castToImpl<IPathFigureStatics,IPathFigureStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathFigureStatics?> =
        arrayOfNulls<IPathFigureStatics_Impl>(size) as Array<IPathFigureStatics?>
  }
}
