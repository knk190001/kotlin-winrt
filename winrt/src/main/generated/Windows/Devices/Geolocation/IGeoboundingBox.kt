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

@ABIMarker(IGeoboundingBox.ABI::class)
@Signature("{0896c80b-274f-43da-9a06-cbfcdaeb4ec2}")
@Guid("0896c80b274f43da9a06cbfcdaeb4ec2")
@WinRTInterface("0896c80b274f43da9a06cbfcdaeb4ec2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeoboundingBox.ByReference::class)
public interface IGeoboundingBox : NativeMapped, IWinRTInterface, IGeoshape {
  @InterfaceMethod(0)
  public fun get_NorthwestCorner(): BasicGeoposition?

  @InterfaceMethod(1)
  public fun get_SoutheastCorner(): BasicGeoposition?

  @InterfaceMethod(2)
  public fun get_Center(): BasicGeoposition?

  @InterfaceMethod(3)
  public fun get_MinAltitude(): Double

  @InterfaceMethod(4)
  public fun get_MaxAltitude(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeoboundingBox> {
    public override fun getValue() = ABI.makeIGeoboundingBox(pointer.getPointer(0))

    public fun setValue(value: IGeoboundingBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeoboundingBox, IGeoshape.WithDefault {
    public val __958455083_Ptr: Pointer?

    public val _958455083_VtblPtr: Pointer?
      get() = __958455083_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NorthwestCorner(): BasicGeoposition? {
      val fnPtr = _958455083_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BasicGeoposition>()
      val hr = fn.invokeHR(arrayOf(__958455083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BasicGeoposition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SoutheastCorner(): BasicGeoposition? {
      val fnPtr = _958455083_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BasicGeoposition>()
      val hr = fn.invokeHR(arrayOf(__958455083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BasicGeoposition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Center(): BasicGeoposition? {
      val fnPtr = _958455083_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BasicGeoposition>()
      val hr = fn.invokeHR(arrayOf(__958455083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BasicGeoposition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MinAltitude(): Double {
      val fnPtr = _958455083_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__958455083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_MaxAltitude(): Double {
      val fnPtr = _958455083_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__958455083_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IGeoboundingBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGeoshape {
    public override val __244607121_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_958455083_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __958455083_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeoboundingBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0896c80b274f43da9a06cbfcdaeb4ec2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeoboundingBox(ptr: Pointer?): WithDefault = IGeoboundingBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeoboundingBox {
      val address = segment.toRawLongValue()
      return makeIGeoboundingBox(Pointer(address))
    }

    public override fun toNative(obj: IGeoboundingBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__958455083_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeoboundingBox): Array<IGeoboundingBox?> = (elements as
        Array<IGeoboundingBox?>).castToImpl<IGeoboundingBox,IGeoboundingBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeoboundingBox?> =
        arrayOfNulls<IGeoboundingBox_Impl>(size) as Array<IGeoboundingBox?>
  }
}
