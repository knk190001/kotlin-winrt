package Windows.Devices.Geolocation

import Windows.Devices.Geolocation.IGeoshape.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGeocircle.ABI::class)
@Signature("{39e45843-a7f9-4e63-92a7-ba0c28d124b1}")
@Guid("39e45843a7f94e6392a7ba0c28d124b1")
@WinRTInterface("39e45843a7f94e6392a7ba0c28d124b1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeocircle.ByReference::class)
public interface IGeocircle : NativeMapped, IWinRTInterface, IGeoshape {
  @InterfaceMethod(0)
  public fun get_Center(): BasicGeoposition?

  @InterfaceMethod(1)
  public fun get_Radius(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGeocircle> {
    public override fun getValue() = ABI.makeIGeocircle(pointer.getPointer(0))

    public fun setValue(value: IGeocircle_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeocircle, IGeoshape.WithDefault {
    public val __550465218_Ptr: Pointer?

    public val _550465218_VtblPtr: Pointer?
      get() = __550465218_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Center(): BasicGeoposition? {
      val fnPtr = _550465218_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BasicGeoposition>()
      val hr = fn.invokeHR(arrayOf(__550465218_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BasicGeoposition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Radius(): Double {
      val fnPtr = _550465218_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__550465218_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IGeocircle_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGeoshape {
    public override val __244607121_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_550465218_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __550465218_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeocircle, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("39e45843a7f94e6392a7ba0c28d124b1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeocircle(ptr: Pointer?): WithDefault = IGeocircle_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeocircle {
      val address = segment.toRawLongValue()
      return makeIGeocircle(Pointer(address))
    }

    public override fun toNative(obj: IGeocircle): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__550465218_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeocircle): Array<IGeocircle?> = (elements as
        Array<IGeocircle?>).castToImpl<IGeocircle,IGeocircle_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeocircle?> = arrayOfNulls<IGeocircle_Impl>(size)
        as Array<IGeocircle?>
  }
}
