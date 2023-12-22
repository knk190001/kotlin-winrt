package Windows.Devices.Display.Core

import Windows.Graphics.DisplayAdapterId
import Windows.Storage.Streams.IBuffer
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplaySource.ABI::class)
@Signature("{ecd15fc1-eadc-51bc-971d-3bc628db2dd4}")
@Guid("ecd15fc1eadc51bc971d3bc628db2dd4")
@WinRTInterface("ecd15fc1eadc51bc971d3bc628db2dd4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplaySource.ByReference::class)
public interface IDisplaySource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AdapterId(): DisplayAdapterId?

  @InterfaceMethod(1)
  public fun get_SourceId(): WinDef.UINT

  @InterfaceMethod(2)
  public fun GetMetadata(Key: com.sun.jna.platform.win32.Guid.GUID?): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDisplaySource>
      {
    public override fun getValue() = ABI.makeIDisplaySource(pointer.getPointer(0))

    public fun setValue(value: IDisplaySource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplaySource {
    public val __1209019195_Ptr: Pointer?

    public val _1209019195_VtblPtr: Pointer?
      get() = __1209019195_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AdapterId(): DisplayAdapterId? {
      val fnPtr = _1209019195_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayAdapterId>()
      val hr = fn.invokeHR(arrayOf(__1209019195_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayAdapterId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SourceId(): WinDef.UINT {
      val fnPtr = _1209019195_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1209019195_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun GetMetadata(Key: com.sun.jna.platform.win32.Guid.GUID?): IBuffer? {
      val fnPtr = _1209019195_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1209019195_Ptr, marshalToNative(Key), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IDisplaySource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1209019195_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplaySource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ecd15fc1eadc51bc971d3bc628db2dd4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplaySource(ptr: Pointer?): WithDefault = IDisplaySource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplaySource {
      val address = segment.toRawLongValue()
      return makeIDisplaySource(Pointer(address))
    }

    public override fun toNative(obj: IDisplaySource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1209019195_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplaySource): Array<IDisplaySource?> = (elements as
        Array<IDisplaySource?>).castToImpl<IDisplaySource,IDisplaySource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplaySource?> =
        arrayOfNulls<IDisplaySource_Impl>(size) as Array<IDisplaySource?>
  }
}
