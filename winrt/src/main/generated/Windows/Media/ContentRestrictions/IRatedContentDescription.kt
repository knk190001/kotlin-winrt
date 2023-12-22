package Windows.Media.ContentRestrictions

import Windows.Foundation.Collections.IVector
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRatedContentDescription.ABI::class)
@Signature("{694866df-66b2-4dc3-96b1-f090eedee255}")
@Guid("694866df66b24dc396b1f090eedee255")
@WinRTInterface("694866df66b24dc396b1f090eedee255")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatedContentDescription.ByReference::class)
public interface IRatedContentDescription : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun put_Id(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Title(): String?

  @InterfaceMethod(3)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Image(): IRandomAccessStreamReference?

  @InterfaceMethod(5)
  public fun put_Image(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(6)
  public fun get_Category(): RatedContentCategory?

  @InterfaceMethod(7)
  public fun put_Category(value: RatedContentCategory?): Unit

  @InterfaceMethod(8)
  public fun get_Ratings(): IVector<String?>?

  @InterfaceMethod(9)
  public fun put_Ratings(value: IVector<String?>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatedContentDescription> {
    public override fun getValue() = ABI.makeIRatedContentDescription(pointer.getPointer(0))

    public fun setValue(value: IRatedContentDescription_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatedContentDescription {
    public val __1572684041_Ptr: Pointer?

    public val _1572684041_VtblPtr: Pointer?
      get() = __1572684041_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1572684041_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1572684041_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Id(value: String?): Unit {
      val fnPtr = _1572684041_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1572684041_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Title(): String? {
      val fnPtr = _1572684041_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1572684041_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _1572684041_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1572684041_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Image(): IRandomAccessStreamReference? {
      val fnPtr = _1572684041_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1572684041_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Image(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _1572684041_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1572684041_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Category(): RatedContentCategory? {
      val fnPtr = _1572684041_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RatedContentCategory>()
      val hr = fn.invokeHR(arrayOf(__1572684041_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RatedContentCategory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Category(value: RatedContentCategory?): Unit {
      val fnPtr = _1572684041_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1572684041_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Ratings(): IVector<String?>? {
      val fnPtr = _1572684041_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1572684041_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Ratings(value: IVector<String?>?): Unit {
      val fnPtr = _1572684041_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1572684041_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRatedContentDescription_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1572684041_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatedContentDescription, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("694866df66b24dc396b1f090eedee255")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatedContentDescription(ptr: Pointer?): WithDefault =
        IRatedContentDescription_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatedContentDescription {
      val address = segment.toRawLongValue()
      return makeIRatedContentDescription(Pointer(address))
    }

    public override fun toNative(obj: IRatedContentDescription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1572684041_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatedContentDescription):
        Array<IRatedContentDescription?> = (elements as
        Array<IRatedContentDescription?>).castToImpl<IRatedContentDescription,IRatedContentDescription_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatedContentDescription?> =
        arrayOfNulls<IRatedContentDescription_Impl>(size) as Array<IRatedContentDescription?>
  }
}
