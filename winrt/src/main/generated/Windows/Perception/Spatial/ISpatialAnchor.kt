package Windows.Perception.Spatial

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(ISpatialAnchor.ABI::class)
@Signature("{0529e5ce-1d34-3702-bcec-eabff578a869}")
@Guid("0529e5ce1d343702bceceabff578a869")
@WinRTInterface("0529e5ce1d343702bceceabff578a869")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAnchor.ByReference::class)
public interface ISpatialAnchor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CoordinateSystem(): SpatialCoordinateSystem?

  @InterfaceMethod(1)
  public fun get_RawCoordinateSystem(): SpatialCoordinateSystem?

  @InterfaceMethod(2)
  public fun add_RawCoordinateSystemAdjusted(handler: TypedEventHandler<SpatialAnchor?,
      SpatialAnchorRawCoordinateSystemAdjustedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_RawCoordinateSystemAdjusted(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISpatialAnchor>
      {
    public override fun getValue() = ABI.makeISpatialAnchor(pointer.getPointer(0))

    public fun setValue(value: ISpatialAnchor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAnchor {
    public val __1801664182_Ptr: Pointer?

    public val _1801664182_VtblPtr: Pointer?
      get() = __1801664182_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CoordinateSystem(): SpatialCoordinateSystem? {
      val fnPtr = _1801664182_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialCoordinateSystem>()
      val hr = fn.invokeHR(arrayOf(__1801664182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialCoordinateSystem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RawCoordinateSystem(): SpatialCoordinateSystem? {
      val fnPtr = _1801664182_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialCoordinateSystem>()
      val hr = fn.invokeHR(arrayOf(__1801664182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialCoordinateSystem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_RawCoordinateSystemAdjusted(handler: TypedEventHandler<SpatialAnchor?,
        SpatialAnchorRawCoordinateSystemAdjustedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1801664182_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1801664182_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_RawCoordinateSystemAdjusted(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1801664182_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1801664182_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpatialAnchor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1801664182_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAnchor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0529e5ce1d343702bceceabff578a869")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAnchor(ptr: Pointer?): WithDefault = ISpatialAnchor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialAnchor {
      val address = segment.toRawLongValue()
      return makeISpatialAnchor(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAnchor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1801664182_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAnchor): Array<ISpatialAnchor?> = (elements as
        Array<ISpatialAnchor?>).castToImpl<ISpatialAnchor,ISpatialAnchor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialAnchor?> =
        arrayOfNulls<ISpatialAnchor_Impl>(size) as Array<ISpatialAnchor?>
  }
}
