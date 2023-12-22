package Windows.Security.EnterpriseData

import Windows.Security.EnterpriseData.IFileUnprotectOptionsFactory.ABI.IID
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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FileUnprotectOptions.ABI::class)
@Signature("rc(Windows.Security.EnterpriseData.FileUnprotectOptions;{7d1312f1-3b0d-4dd8-a1f8-1ec53822e2f3})")
@WinRTByReference(brClass = FileUnprotectOptions.ByReference::class)
public class FileUnprotectOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileUnprotectOptions.WithDefault, IWinRTObject {
  private val __1888801631_Interface: IFileUnprotectOptions.WithDefault by lazy {
    as_1888801631()
  }


  public override val __1888801631_Ptr: JNAPointer? by lazy {
    __1888801631_Interface.__1888801631_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1888801631_Interface)

  public constructor(audit: Boolean) : this(ABI.activate(audit))

  private fun as_1888801631(): IFileUnprotectOptions.WithDefault {
    if(pointer == NULL) {
      return(IFileUnprotectOptions.ABI.makeIFileUnprotectOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileUnprotectOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileUnprotectOptions.ABI.makeIFileUnprotectOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FileUnprotectOptions> {
    public override fun getValue() = FileUnprotectOptions(pointer.getPointer(0))

    public fun setValue(value: FileUnprotectOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileUnprotectOptions, MemoryAddress> {
    public val IFileUnprotectOptionsFactory_Instance: IFileUnprotectOptionsFactory by lazy {
      createIFileUnprotectOptionsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFileUnprotectOptionsFactory(): IFileUnprotectOptionsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.EnterpriseData.FileUnprotectOptions".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFileUnprotectOptionsFactory.ABI.makeIFileUnprotectOptionsFactory(factoryActivatorPtr.value))
    }

    public fun activate(audit: Boolean): JNAPointer? =
        IFileUnprotectOptionsFactory_Instance.Create(audit)?.pointer

    public override fun fromNative(segment: MemoryAddress): FileUnprotectOptions {
      val address = segment.toRawLongValue()
      return FileUnprotectOptions(Pointer(address))
    }

    public override fun toNative(obj: FileUnprotectOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
