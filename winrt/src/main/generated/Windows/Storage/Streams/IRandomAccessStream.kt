package Windows.Storage.Streams

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRandomAccessStream.ABI::class)
@Signature("{905a0fe1-bc53-11df-8c49-001e4fc686da}")
@Guid("905a0fe1bc5311df8c49001e4fc686da")
@WinRTInterface("905a0fe1bc5311df8c49001e4fc686da")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRandomAccessStream.ByReference::class)
public interface IRandomAccessStream : NativeMapped, IWinRTInterface, IClosable, IInputStream,
    IOutputStream {
  @InterfaceMethod(0)
  public fun get_Size(): WinDef.ULONG

  @InterfaceMethod(1)
  public fun put_Size(value: WinDef.ULONG): Unit

  @InterfaceMethod(2)
  public fun GetInputStreamAt(position: WinDef.ULONG): IInputStream?

  @InterfaceMethod(3)
  public fun GetOutputStreamAt(position: WinDef.ULONG): IOutputStream?

  @InterfaceMethod(4)
  public fun get_Position(): WinDef.ULONG

  @InterfaceMethod(5)
  public fun Seek(position: WinDef.ULONG): Unit

  @InterfaceMethod(6)
  public fun CloneStream(): IRandomAccessStream?

  @InterfaceMethod(7)
  public fun get_CanRead(): Boolean

  @InterfaceMethod(8)
  public fun get_CanWrite(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRandomAccessStream> {
    public override fun getValue() = ABI.makeIRandomAccessStream(pointer.getPointer(0))

    public fun setValue(value: IRandomAccessStream_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRandomAccessStream, IClosable.WithDefault,
      IInputStream.WithDefault, IOutputStream.WithDefault {
    public val __597747131_Ptr: Pointer?

    public val _597747131_VtblPtr: Pointer?
      get() = __597747131_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Size(): WinDef.ULONG {
      val fnPtr = _597747131_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__597747131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Size(value: WinDef.ULONG): Unit {
      val fnPtr = _597747131_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__597747131_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetInputStreamAt(position: WinDef.ULONG): IInputStream? {
      val fnPtr = _597747131_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__597747131_Ptr, position, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetOutputStreamAt(position: WinDef.ULONG): IOutputStream? {
      val fnPtr = _597747131_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__597747131_Ptr, position, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Position(): WinDef.ULONG {
      val fnPtr = _597747131_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__597747131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun Seek(position: WinDef.ULONG): Unit {
      val fnPtr = _597747131_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__597747131_Ptr, position,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun CloneStream(): IRandomAccessStream? {
      val fnPtr = _597747131_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStream>()
      val hr = fn.invokeHR(arrayOf(__597747131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_CanRead(): Boolean {
      val fnPtr = _597747131_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__597747131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_CanWrite(): Boolean {
      val fnPtr = _597747131_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__597747131_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRandomAccessStream_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable, IInputStream,
      IOutputStream {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_597747131_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __736491754_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IInputStream.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_597747131_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __591248843_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IOutputStream.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_597747131_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __597747131_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRandomAccessStream, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("905a0fe1bc5311df8c49001e4fc686da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRandomAccessStream(ptr: Pointer?): WithDefault = IRandomAccessStream_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRandomAccessStream {
      val address = segment.toRawLongValue()
      return makeIRandomAccessStream(Pointer(address))
    }

    public override fun toNative(obj: IRandomAccessStream): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__597747131_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRandomAccessStream): Array<IRandomAccessStream?> =
        (elements as
        Array<IRandomAccessStream?>).castToImpl<IRandomAccessStream,IRandomAccessStream_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRandomAccessStream?> =
        arrayOfNulls<IRandomAccessStream_Impl>(size) as Array<IRandomAccessStream?>
  }
}
