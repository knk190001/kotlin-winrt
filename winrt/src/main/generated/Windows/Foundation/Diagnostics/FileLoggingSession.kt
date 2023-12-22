package Windows.Foundation.Diagnostics

import Windows.Foundation.Diagnostics.IFileLoggingSessionFactory.ABI.IID
import Windows.Foundation.IClosable
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FileLoggingSession.ABI::class)
@Signature("rc(Windows.Foundation.Diagnostics.FileLoggingSession;{24c74216-fed2-404c-895f-1f9699cb02f7})")
@WinRTByReference(brClass = FileLoggingSession.ByReference::class)
public class FileLoggingSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileLoggingSession.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __746971296_Interface: IFileLoggingSession.WithDefault by lazy {
    as_746971296()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __746971296_Ptr: JNAPointer? by lazy {
    __746971296_Interface.__746971296_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__746971296_Interface, __1260617006_Interface)

  public constructor(name: String) : this(ABI.activate(name))

  private fun as_746971296(): IFileLoggingSession.WithDefault {
    if(pointer == NULL) {
      return(IFileLoggingSession.ABI.makeIFileLoggingSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileLoggingSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileLoggingSession.ABI.makeIFileLoggingSession(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FileLoggingSession> {
    public override fun getValue() = FileLoggingSession(pointer.getPointer(0))

    public fun setValue(value: FileLoggingSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileLoggingSession, MemoryAddress> {
    public val IFileLoggingSessionFactory_Instance: IFileLoggingSessionFactory by lazy {
      createIFileLoggingSessionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFileLoggingSessionFactory(): IFileLoggingSessionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Diagnostics.FileLoggingSession".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFileLoggingSessionFactory.ABI.makeIFileLoggingSessionFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        IFileLoggingSessionFactory_Instance.Create(name)?.pointer

    public override fun fromNative(segment: MemoryAddress): FileLoggingSession {
      val address = segment.toRawLongValue()
      return FileLoggingSession(Pointer(address))
    }

    public override fun toNative(obj: FileLoggingSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
