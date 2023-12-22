package Windows.UI.Shell

import Windows.Foundation.IAsyncOperation
import Windows.UI.Shell.ITaskbarManager.ABI.IID
import Windows.UI.StartScreen.SecondaryTile
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITaskbarManager2.ABI::class)
@Signature("{79f0a06e-7b02-4911-918c-dee0bbd20ba4}")
@Guid("79f0a06e7b024911918cdee0bbd20ba4")
@WinRTInterface("79f0a06e7b024911918cdee0bbd20ba4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITaskbarManager2.ByReference::class)
public interface ITaskbarManager2 : NativeMapped, IWinRTInterface, ITaskbarManager {
  @InterfaceMethod(0)
  public fun IsSecondaryTilePinnedAsync(tileId: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun RequestPinSecondaryTileAsync(secondaryTile: SecondaryTile?): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun TryUnpinSecondaryTileAsync(tileId: String?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITaskbarManager2> {
    public override fun getValue() = ABI.makeITaskbarManager2(pointer.getPointer(0))

    public fun setValue(value: ITaskbarManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITaskbarManager2, ITaskbarManager.WithDefault {
    public val __1742434165_Ptr: Pointer?

    public val _1742434165_VtblPtr: Pointer?
      get() = __1742434165_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSecondaryTilePinnedAsync(tileId: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _1742434165_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1742434165_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestPinSecondaryTileAsync(secondaryTile: SecondaryTile?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1742434165_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1742434165_Ptr, marshalToNative(secondaryTile), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun TryUnpinSecondaryTileAsync(tileId: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _1742434165_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1742434165_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ITaskbarManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ITaskbarManager {
    public override val __1857322873_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1742434165_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1742434165_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITaskbarManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79f0a06e7b024911918cdee0bbd20ba4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITaskbarManager2(ptr: Pointer?): WithDefault = ITaskbarManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITaskbarManager2 {
      val address = segment.toRawLongValue()
      return makeITaskbarManager2(Pointer(address))
    }

    public override fun toNative(obj: ITaskbarManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1742434165_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITaskbarManager2): Array<ITaskbarManager2?> = (elements as
        Array<ITaskbarManager2?>).castToImpl<ITaskbarManager2,ITaskbarManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITaskbarManager2?> =
        arrayOfNulls<ITaskbarManager2_Impl>(size) as Array<ITaskbarManager2?>
  }
}
