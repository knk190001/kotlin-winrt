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

@ABIMarker(IMapElement3DStatics.ABI::class)
@Signature("{6128011a-450f-442a-b9d9-aa815c71907a}")
@Guid("6128011a450f442ab9d9aa815c71907a")
@WinRTInterface("6128011a450f442ab9d9aa815c71907a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapElement3DStatics.ByReference::class)
public interface IMapElement3DStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LocationProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_HeadingProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_PitchProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_RollProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_ScaleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapElement3DStatics> {
    public override fun getValue() = ABI.makeIMapElement3DStatics(pointer.getPointer(0))

    public fun setValue(value: IMapElement3DStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapElement3DStatics {
    public val __93735645_Ptr: Pointer?

    public val _93735645_VtblPtr: Pointer?
      get() = __93735645_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LocationProperty(): DependencyProperty? {
      val fnPtr = _93735645_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__93735645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HeadingProperty(): DependencyProperty? {
      val fnPtr = _93735645_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__93735645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PitchProperty(): DependencyProperty? {
      val fnPtr = _93735645_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__93735645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RollProperty(): DependencyProperty? {
      val fnPtr = _93735645_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__93735645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ScaleProperty(): DependencyProperty? {
      val fnPtr = _93735645_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__93735645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IMapElement3DStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __93735645_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapElement3DStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6128011a450f442ab9d9aa815c71907a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapElement3DStatics(ptr: Pointer?): WithDefault = IMapElement3DStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapElement3DStatics {
      val address = segment.toRawLongValue()
      return makeIMapElement3DStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapElement3DStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__93735645_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapElement3DStatics): Array<IMapElement3DStatics?> =
        (elements as
        Array<IMapElement3DStatics?>).castToImpl<IMapElement3DStatics,IMapElement3DStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapElement3DStatics?> =
        arrayOfNulls<IMapElement3DStatics_Impl>(size) as Array<IMapElement3DStatics?>
  }
}
