package Windows.UI.Core

import Windows.UI.Core.ICoreCursorFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CoreCursor.ABI::class)
@Signature("rc(Windows.UI.Core.CoreCursor;{96893acf-111d-442c-8a77-b87992f8e2d6})")
@WinRTByReference(brClass = CoreCursor.ByReference::class)
public class CoreCursor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreCursor.WithDefault, IWinRTObject {
  private val __376155632_Interface: ICoreCursor.WithDefault by lazy {
    as_376155632()
  }


  public override val __376155632_Ptr: JNAPointer? by lazy {
    __376155632_Interface.__376155632_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__376155632_Interface)

  public constructor(type: CoreCursorType, id: WinDef.UINT) : this(ABI.activate(type, id))

  private fun as_376155632(): ICoreCursor.WithDefault {
    if(pointer == NULL) {
      return(ICoreCursor.ABI.makeICoreCursor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreCursor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreCursor.ABI.makeICoreCursor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CoreCursor> {
    public override fun getValue() = CoreCursor(pointer.getPointer(0))

    public fun setValue(value: CoreCursor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreCursor, MemoryAddress> {
    public val ICoreCursorFactory_Instance: ICoreCursorFactory by lazy {
      createICoreCursorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreCursorFactory(): ICoreCursorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Core.CoreCursor".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICoreCursorFactory.ABI.makeICoreCursorFactory(factoryActivatorPtr.value))
    }

    public fun activate(type: CoreCursorType, id: WinDef.UINT): JNAPointer? =
        ICoreCursorFactory_Instance.CreateCursor(type, id)?.pointer

    public override fun fromNative(segment: MemoryAddress): CoreCursor {
      val address = segment.toRawLongValue()
      return CoreCursor(Pointer(address))
    }

    public override fun toNative(obj: CoreCursor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
