package Windows.Media.Capture

import Windows.Foundation.IClosable
import Windows.Storage.Streams.IContentTypeProvider
import Windows.Storage.Streams.IInputStream
import Windows.Storage.Streams.IOutputStream
import Windows.Storage.Streams.IRandomAccessStream
import Windows.Storage.Streams.IRandomAccessStreamWithContentType
import Windows.Storage.Streams.IRandomAccessStreamWithContentType.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ICapturedFrame.ABI::class)
@Signature("{1dd2de1f-571b-44d8-8e80-a08a1578766e}")
@Guid("1dd2de1f571b44d88e80a08a1578766e")
@WinRTInterface("1dd2de1f571b44d88e80a08a1578766e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICapturedFrame.ByReference::class)
public interface ICapturedFrame : NativeMapped, IWinRTInterface, IRandomAccessStreamWithContentType,
    IRandomAccessStream, IClosable, IInputStream, IOutputStream, IContentTypeProvider {
  @InterfaceMethod(0)
  public fun get_Width(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Height(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICapturedFrame>
      {
    public override fun getValue() = ABI.makeICapturedFrame(pointer.getPointer(0))

    public fun setValue(value: ICapturedFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICapturedFrame, IRandomAccessStreamWithContentType.WithDefault,
      IRandomAccessStream.WithDefault, IClosable.WithDefault, IInputStream.WithDefault,
      IOutputStream.WithDefault, IContentTypeProvider.WithDefault {
    public val __909988521_Ptr: Pointer?

    public val _909988521_VtblPtr: Pointer?
      get() = __909988521_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Width(): WinDef.UINT {
      val fnPtr = _909988521_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__909988521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Height(): WinDef.UINT {
      val fnPtr = _909988521_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__909988521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ICapturedFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface,
      IRandomAccessStreamWithContentType, IRandomAccessStream, IClosable, IInputStream,
      IOutputStream, IContentTypeProvider {
    public override val __380663666_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_909988521_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __597747131_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IRandomAccessStream.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_909988521_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_909988521_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __736491754_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IInputStream.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_909988521_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __591248843_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IOutputStream.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_909988521_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __412040816_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IContentTypeProvider.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_909988521_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __909988521_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICapturedFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1dd2de1f571b44d88e80a08a1578766e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICapturedFrame(ptr: Pointer?): WithDefault = ICapturedFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICapturedFrame {
      val address = segment.toRawLongValue()
      return makeICapturedFrame(Pointer(address))
    }

    public override fun toNative(obj: ICapturedFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__909988521_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICapturedFrame): Array<ICapturedFrame?> = (elements as
        Array<ICapturedFrame?>).castToImpl<ICapturedFrame,ICapturedFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICapturedFrame?> =
        arrayOfNulls<ICapturedFrame_Impl>(size) as Array<ICapturedFrame?>
  }
}
