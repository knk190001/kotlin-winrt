package Windows.ApplicationModel.Chat

import Windows.ApplicationModel.Chat.IChatMessageAttachment.ABI.IID
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChatMessageAttachment2.ABI::class)
@Signature("{5ed99270-7dd1-4a87-a8ce-acdd87d80dc8}")
@Guid("5ed992707dd14a87a8ceacdd87d80dc8")
@WinRTInterface("5ed992707dd14a87a8ceacdd87d80dc8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageAttachment2.ByReference::class)
public interface IChatMessageAttachment2 : NativeMapped, IWinRTInterface, IChatMessageAttachment {
  @InterfaceMethod(0)
  public fun get_Thumbnail(): IRandomAccessStreamReference?

  @InterfaceMethod(1)
  public fun put_Thumbnail(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(2)
  public fun get_TransferProgress(): Double

  @InterfaceMethod(3)
  public fun put_TransferProgress(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_OriginalFileName(): String?

  @InterfaceMethod(5)
  public fun put_OriginalFileName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageAttachment2> {
    public override fun getValue() = ABI.makeIChatMessageAttachment2(pointer.getPointer(0))

    public fun setValue(value: IChatMessageAttachment2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageAttachment2, IChatMessageAttachment.WithDefault {
    public val __884871001_Ptr: Pointer?

    public val _884871001_VtblPtr: Pointer?
      get() = __884871001_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Thumbnail(): IRandomAccessStreamReference? {
      val fnPtr = _884871001_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__884871001_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Thumbnail(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _884871001_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__884871001_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TransferProgress(): Double {
      val fnPtr = _884871001_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__884871001_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_TransferProgress(value: Double): Unit {
      val fnPtr = _884871001_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__884871001_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OriginalFileName(): String? {
      val fnPtr = _884871001_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__884871001_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_OriginalFileName(value: String?): Unit {
      val fnPtr = _884871001_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__884871001_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChatMessageAttachment2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IChatMessageAttachment {
    public override val __1691112213_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_884871001_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __884871001_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageAttachment2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ed992707dd14a87a8ceacdd87d80dc8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageAttachment2(ptr: Pointer?): WithDefault =
        IChatMessageAttachment2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageAttachment2 {
      val address = segment.toRawLongValue()
      return makeIChatMessageAttachment2(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageAttachment2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__884871001_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageAttachment2): Array<IChatMessageAttachment2?>
        = (elements as
        Array<IChatMessageAttachment2?>).castToImpl<IChatMessageAttachment2,IChatMessageAttachment2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageAttachment2?> =
        arrayOfNulls<IChatMessageAttachment2_Impl>(size) as Array<IChatMessageAttachment2?>
  }
}
