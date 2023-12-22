package Windows.Media.Protection.PlayReady

import Windows.Media.Core.IMediaStreamDescriptor
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INDStreamParser.ABI::class)
@Signature("{e0baa198-9796-41c9-8695-59437e67e66a}")
@Guid("e0baa198979641c9869559437e67e66a")
@WinRTInterface("e0baa198979641c9869559437e67e66a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDStreamParser.ByReference::class)
public interface INDStreamParser : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ParseData(dataBytes: Array<Byte>): Unit

  @InterfaceMethod(1)
  public fun GetStreamInformation(descriptor: IMediaStreamDescriptor?,
      streamType: Windows.Media.Protection.PlayReady.NDMediaStreamType.ByReference?): WinDef.UINT

  @InterfaceMethod(2)
  public fun BeginOfStream(): Unit

  @InterfaceMethod(3)
  public fun EndOfStream(): Unit

  @InterfaceMethod(4)
  public fun get_Notifier(): NDStreamParserNotifier?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDStreamParser> {
    public override fun getValue() = ABI.makeINDStreamParser(pointer.getPointer(0))

    public fun setValue(value: INDStreamParser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDStreamParser {
    public val __1355337967_Ptr: Pointer?

    public val _1355337967_VtblPtr: Pointer?
      get() = __1355337967_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ParseData(dataBytes: Array<Byte>): Unit {
      val fnPtr = _1355337967_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1355337967_Ptr, dataBytes.size,marshalToNative(dataBytes),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetStreamInformation(descriptor: IMediaStreamDescriptor?,
        streamType: Windows.Media.Protection.PlayReady.NDMediaStreamType.ByReference?):
        WinDef.UINT {
      val fnPtr = _1355337967_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1355337967_Ptr, marshalToNative(descriptor),
          marshalToNative(streamType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun BeginOfStream(): Unit {
      val fnPtr = _1355337967_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1355337967_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun EndOfStream(): Unit {
      val fnPtr = _1355337967_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1355337967_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Notifier(): NDStreamParserNotifier? {
      val fnPtr = _1355337967_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NDStreamParserNotifier>()
      val hr = fn.invokeHR(arrayOf(__1355337967_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NDStreamParserNotifier>(result.getValue())
      return resultValue
    }
  }

  public class INDStreamParser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1355337967_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDStreamParser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e0baa198979641c9869559437e67e66a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDStreamParser(ptr: Pointer?): WithDefault = INDStreamParser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDStreamParser {
      val address = segment.toRawLongValue()
      return makeINDStreamParser(Pointer(address))
    }

    public override fun toNative(obj: INDStreamParser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1355337967_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDStreamParser): Array<INDStreamParser?> = (elements as
        Array<INDStreamParser?>).castToImpl<INDStreamParser,INDStreamParser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDStreamParser?> =
        arrayOfNulls<INDStreamParser_Impl>(size) as Array<INDStreamParser?>
  }
}
